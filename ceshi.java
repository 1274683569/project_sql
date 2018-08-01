import java.util.HashSet;

public class ceshi {
    public static char findFirstRepeat(String A, int n) {
        HashSet hs=new HashSet();
        int length=A.length();
        //利用toCharArray()将String类型转化为char类型
        char[] a=A.toCharArray();
        for(int i=0;i < length;i++)
        {
            boolean b=hs.add(a[i]);//通过往hashset塞值（hashset不准有重复元素），判断当前一段数据中是否有重复元素，一但有，立刻返回
            if(b==false)
            {
                return a[i];
            }
        }
        return'0';
    }
    public static void main(String[] args) {
        String A = "qywyer23tdd";
        int n = A.length();
        char b = findFirstRepeat(A, n);
        System.out.println(b);
    }
}
