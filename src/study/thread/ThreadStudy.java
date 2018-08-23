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
	 * 字符串反转
	 * @param str
	 * @return
	 */
	public String reverse(String str) {
		return new StringBuffer(str).reverse().toString();
	}
	
	/**
	 * 统计类型字符个数
	 * @param str
	 */
	public void countStr(String str) {
		int length = str.length();
		int word = 0;	//字母的个数
		int space = 0;	//空格的个数
		int number = 0;	//数字的个数
		for(int i = 0;i<=length;i++) {
		char a = str.charAt(i);
		if((a > 'A' && a < 'Z') || (a > 'a' && a < 'z'))//英文字母
			word ++;
			else if(a == ' ')//空格
				space ++;
			else if(a > '0' && a < '9')//数字
				number ++;
		}
		System.out.println(word);
		System.out.println(space);
		System.out.println(number);
	}
	
	/**
	 * 计算n的阶层
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
	 * 冒泡排序
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
	 * 选择排序
	 * @param numbers
	 */
	public static void selectSort(int[] numbers)
    {
    int size = numbers.length; //数组长度
    int temp = 0 ; //中间变量
    
    for(int i = 0 ; i < size ; i++)
    {
        int k = i;   //待确定的位置
        //选择出应该在第i个位置的数
        for(int j = size -1 ; j > i ; j--)
        {
        if(numbers[j] < numbers[k])
        {
            k = j;
        }
        }
        //交换两个数
        temp = numbers[i];
        numbers[i] = numbers[k];
        numbers[k] = temp;
    }
    }
	
	 /**  
     * 插入排序
     * 
     * 从第一个元素开始，该元素可以认为已经被排序
     * 取出下一个元素，在已经排序的元素序列中从后向前扫描 
     * 如果该元素（已排序）大于新元素，将该元素移到下一位置  
     * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置  
     * 将新元素插入到该位置中  
     * 重复步骤2  
     * @param numbers  待排序数组
     */  
    public static void insertSort(int[] numbers)
    {
    int size = numbers.length;
    int temp = 0 ;
    int j =  0;
    
    for(int i = 0 ; i < size ; i++)
    {
        temp = numbers[i];
        //假如temp比前面的值小，则将前面的值后移
        for(j = i ; j > 0 && temp < numbers[j-1] ; j --)
        {
        numbers[j] = numbers[j-1];
        }
        numbers[j] = temp;
    }
    }
}

