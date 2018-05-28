/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BEAUTIFUL NEHA
 */
public class Pattern3 {
    void spaceStar()
    {
       for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
        
                {
                    System.out.print("*");
                }
            System.out.println();
        }
    }
public static void main(String a[])
{
    Pattern3 p1=new Pattern3();
            p1.spaceStar();
}
}