import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Switch obj = new Switch();
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Enter order (nxn) for both matrices(with space):");
        int size = sc.nextInt();
        int[][] a = new int[size][size];
        int[][] b = new int[size][size];
        System.out.println("Enter matrix A's values");
        obj.inputMat(a, sc);
        System.out.println("Enter Matrix B's values");
        obj.inputMat(b, sc);
        do {
            System.out.println("");
            System.out.println("Enter your choice:\n1.Add\n2.Multiply\n3.Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    obj.addMath(a, b);
                    break;

                case 2:
                    obj.multiplyMat(a, b);
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Invalid input!");
                    break;
            }
        } while (choice != 3);
        System.out.println("PROGRAM EXITED!");
        sc.close();
    }

    public void inputMat(int[][] matrix, Scanner in) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.println("The given matrix is:\n");
        display(matrix);
    }

    public void display(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void addMath(int [][]a, int [][]b)
    {
        int [][]c = new int[a.length][a.length];
        for(int i = 0;i<a.length;i++)
        {
            for(int j = 0;j<a[i].length;j++)
            {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("The Resultant matrix after adding is:");
        display(c);
    }

    public void multiplyMat(int [][]a, int [][]b)
    {
        int [][]c = new int[a.length][a.length];
        for(int i=0;i<a.length;i++){    
            for(int j=0;j<a[i].length;j++)
            {  
                c[i][j]=0;      
                for(int k=0;k<b[i].length;k++)      
                {      
                    c[i][j]+=a[i][k]*b[k][j];      
                }
            }
        }
        System.out.println("The resultant matrix after multiplying is:");
        display(c);
    }
}
    
