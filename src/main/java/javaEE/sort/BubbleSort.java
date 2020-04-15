package javaEE.sort;

/**
 * 冒泡排序
 * 核心：相邻的两个值 进行比对
 * 值大 排右
 */
public class BubbleSort {
    public static void main(String[] args){
        int[] num={7,10,19,2,37,66,12,0,7};
        for(int i=0;i<num.length-1;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]>num[j]){
                    int a=num[i];
                    num[i]=num[j];
                    num[j]=a;
                }
            }
        }
       for(int k=0;k<num.length;k++){
           System.out.print(num[k]+",");
       }

    }
}
