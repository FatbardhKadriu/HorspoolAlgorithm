public class Horspool {

    public static int SIZE=500;
    public static int table[]=new int[SIZE];

    public void ShiftTable(String pattern) {
        int i,j,m;
        char p[] = pattern.toCharArray();
        m=pattern.length();

        for (i=0;i<SIZE;i++)
            table[i]=m;
        for (j=0;j<m-1;j++)
            table[p[j]]=m-1-j;
    }

    public int HorspoolMatching(String text,String pattern)
    {
        int i,k,m;
        char T[] = text.toCharArray();
        char P[] = pattern.toCharArray();
        m = pattern.length();
        i = m - 1;

        while(i < text.length())
        {
            k=0;
            while((k<m) && (P[m-1-k] == T[i-k]))
                k++;
            if(k==m)
            {
                return i-m+1; // position of the pattern founded
            }
            else
                i+=table[T[i]];
        }
        return -1;
    }
}
