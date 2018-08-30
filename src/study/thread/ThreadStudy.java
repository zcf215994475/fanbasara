package study.thread;

public class ThreadStudy {
	public static void main(String[] arg) {
		ThreadStudy ThreadStudy = new  ThreadStudy();
		/*String str = ThreadStudy.reverse("asdzxc");
		System.out.println(str);
		ThreadStudy.countStr("as3a 9  0a9dw w1");*/
		int[] arr = {3,6,9,4,1};
		ThreadStudy.bubbleSort(arr);
		
	}
	
	/**
	 * �ַ�����ת
	 * @param str
	 * @return
	 */
	public String reverse(String str) {
		return new StringBuffer(str).reverse().toString();
	}
	
	/**
	 * ͳ�������ַ�����
	 * @param str
	 */
	public void countStr(String str) {
		int length = str.length();
		int word = 0;	//��ĸ�ĸ���
		int space = 0;	//�ո�ĸ���
		int number = 0;	//���ֵĸ���
		for(int i = 0;i<=length;i++) {
		char a = str.charAt(i);
		if((a > 'A' && a < 'Z') || (a > 'a' && a < 'z'))//Ӣ����ĸ
			word ++;
			else if(a == ' ')//�ո�
				space ++;
			else if(a > '0' && a < '9')//����
				number ++;
		}
		System.out.println(word);
		System.out.println(space);
		System.out.println(number);
	}
	
	/**
	 * ����n�Ľײ�
	 * @param n
	 * @return
	 */
	public int calculate(int n) {
		int sum = 1;
		for(int i = 1;i<=n;i++) {
			sum = sum * i;
		}
		return sum;
		
	}
	
	/**
	 * ð������
	 * @param arr
	 */
	public void bubbleSort(int[] arr) {
		int length = arr.length;
		for(int i =0;i<length-1;i++) {
			for(int j = 0;j<length-1;j++) {
				if(arr[j+1]<arr[j]) {
					int temp = 0;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int a:arr) {
			System.out.println(a);
		}
	}
	
	/**
	 * ѡ������
	 * @param numbers
	 */
	public static void selectSort(int[] numbers)
    {
    int size = numbers.length; //���鳤��
    int temp = 0 ; //�м����
    
    for(int i = 0 ; i < size ; i++)
    {
        int k = i;   //��ȷ����λ��
        //ѡ���Ӧ���ڵ�i��λ�õ���
        for(int j = size -1 ; j > i ; j--)
        {
        if(numbers[j] < numbers[k])
        {
            k = j;
        }
        }
        //����������
        temp = numbers[i];
        numbers[i] = numbers[k];
        numbers[k] = temp;
    }
    }
	
	 /**  
     * ��������
     * 
     * �ӵ�һ��Ԫ�ؿ�ʼ����Ԫ�ؿ�����Ϊ�Ѿ�������
     * ȡ����һ��Ԫ�أ����Ѿ������Ԫ�������дӺ���ǰɨ�� 
     * �����Ԫ�أ������򣩴�����Ԫ�أ�����Ԫ���Ƶ���һλ��  
     * �ظ�����3��ֱ���ҵ��������Ԫ��С�ڻ��ߵ�����Ԫ�ص�λ��  
     * ����Ԫ�ز��뵽��λ����  
     * �ظ�����2  
     * @param numbers  ����������
     */  
    public static void insertSort(int[] numbers)
    {
    int size = numbers.length;
    int temp = 0 ;
    int j =  0;
    
    for(int i = 0 ; i < size ; i++)
    {
        temp = numbers[i];
        //����temp��ǰ���ֵС����ǰ���ֵ����
        for(j = i ; j > 0 && temp < numbers[j-1] ; j --)
        {
        numbers[j] = numbers[j-1];
        }
        numbers[j] = temp;
    }
    }
}

