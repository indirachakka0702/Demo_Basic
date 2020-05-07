package Practice.java;

public class JaggedArrayPractice {
		public static void main(String[] args) {
			 int x[]= {5,6,7,8};
			 int y[]= {6,7};
			 int z[]= {3,4,5};
			 int p[][]= {
					      {5,6,7,8},
					      {6,7},
					      {3,4,5}
			             };
			 // for jagged array different size of arrays we can take//
			 int k[][]=new int[3][];
			 k[0]=new int[4];
			 k[1]=new int[2];
			 k[2]=new int[3];
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
