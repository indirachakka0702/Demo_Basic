package Practice.java;

public class Practice1 {

	public static void main(String[] args) {
		 int x[]= {5,6,7,8};
		 int y[]= {6,7,8,9};
		 int z[]= {3,4,5,6};
		 int p[][]= {
				      {5,6,7,8},
				      {6,7,8,9},
				      {3,4,5,6}
		             };
		 /* for(int i=0;i<3;i++)
		    {
		         for(int j=0;j<4;j++)
		         {
		            System.out.print(p[i][j]+" ")
		            }
		            System.out.println("")
		            }            */
		 for(int i[]:p)
		 {
			 for(int j:i)
			 {
				 System.out.print(j+ " ");
			 }
			 System.out.println("");
		 }
	}

}
