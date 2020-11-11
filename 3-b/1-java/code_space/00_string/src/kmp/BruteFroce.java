package kmp;
/**
 * ����ƥ��
 * @author Administrator
 *
 */
public class BruteFroce {
	
	public static int bruteForce(String s,String p) {
		long beginTime = System.currentTimeMillis();
		int index = -1; //�ɹ�ƥ���λ�ã�ƥ�䲻������-1
		int sLength = s.length();
		int pLength = p.length();
		if(sLength < pLength) {
			 System.out.println("Error.The main string is greater than the sub string length.");
			return -1;
		}
		int i = 0;//��ǰ�����������±�
		int j = 0;//��ǰ�����ִ����±�
		//����������
		while(i < sLength && j < pLength)  {
			if(s.charAt(i) == p.charAt(j)) {
				//�ַ���ȣ�ָ�����
				i++;
				j++;
			}else {
				//�����ص��ϴ�ƥ����ַ�����һ���ַ����Ӵ���0��ʼ
				i = i - j + 1;//��Ҫ�黹i��ǰ�ߵ�j����Ȼ���1
				j = 0; //�����ע�Ӵ���ǰ���˶��ٲ���ֱ�ӹ���
			}
		}
		
		if(j == pLength) { //ƥ��ɹ�
			index = i - j;
			System.out.println("BF Successful match,index is:" + index);
		} else {// ƥ��ʧ��
            System.out.println("Match failed.");
        }
		long endTime = System.currentTimeMillis();
		System.out.println("BF cost time = "+(endTime - beginTime));
		return index;
	}
}