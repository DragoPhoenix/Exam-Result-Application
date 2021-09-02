import java.util.*;
class Subjects
{
    protected int subs[]={0,0,0,0,0,0,0};                       
    String subjects[]={"Physics","Chemistry","Mathematics","Biology","English","Computer","Physical Education"};
    protected double marks[][]={{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0}};
    protected double Total_Marks;
    protected double percentage;
    char Grade;
    char grades[]={' ',' ',' ',' ',' ',' ',' '};
    String Grade_meanings[]={"Honours","First Div","Second Div","Third Div","Failed"};
    void enterMarks()
    {
        Scanner sc=new Scanner(System.in);
        double m;
        for(int i=0;i<7;i++)
        {
            if(subs[i]==1)
            {
                switch(i)
                {
                    case 0:
                    case 1:
                    case 3:
                        System.out.println("Enter Marks in "+subjects[i]+" Theory out of 70");
                        m=sc.nextDouble();
                        if(m>70)
                        {
                            while(m>70)
                            {
                                System.out.println("Please Enter valid Marks out of 70");
                                m=sc.nextDouble();
                            }
                        }
                        marks[i][0]=m;
                        System.out.println("Enter Marks in "+subjects[i]+" Lab out of 30");
                        m=sc.nextDouble();
                        if(m>30)
                        {
                            while(m>30)
                            {
                                System.out.println("Please Enter valid Marks out of 30");
                                m=sc.nextDouble();
                            }
                        }
                        marks[i][1]=m;
                        break;
                    case 2:
                    case 4:
                        System.out.println("Enter Marks in "+subjects[i]+" Theory out of 100");
                        m=sc.nextDouble();
                        if(m>100)
                        {
                            while(m>100)
                            {
                                System.out.println("Please Enter valid Marks out of 100");
                                m=sc.nextDouble();
                            }
                        }
                        marks[i][0]=m;
                        marks[i][1]=0;
                        break;
                    case 5:
                    case 6:
                        System.out.println("Enter Marks in "+subjects[i]+" Theory out of 60");
                        m=sc.nextDouble();
                        if(m>70)
                        {
                            while(m>70)
                            {
                                System.out.println("Please Enter valid Marks out of 70");
                                m=sc.nextDouble();
                            }
                        }
                        marks[i][0]=m;
                        System.out.println("Enter Marks in "+subjects[i]+" Practical out of 40");
                        m=sc.nextDouble();
                        if(m>40)
                        {
                            while(m>40)
                            {
                                System.out.println("Please Enter valid Marks out of 40");
                                m=sc.nextDouble();
                            }
                        }
                        marks[i][1]=m;
                        break;
                }
            }
        }
        calculate();
    }
    void calculate()
    {
        double total;
        for(int i=0;i<7;i++)
        {
            if(subs[i]==1)
            {
                total=marks[i][0]+marks[i][1];
                Total_Marks=Total_Marks+total;
                if(total>=80)
                    grades[i]='A';
                else if(total >=60)
                    grades[i]='B';
                else if(total>=48)
                    grades[i]='C';
                else if(total>=40)
                    grades[i]='D';
                else
                    grades[i]='E';
            }
        }
        percentage=Total_Marks/5;
        if(percentage>=80)
            Grade='A';
        else if(percentage >=60)
            Grade='B';
        else if(percentage>=48)
            Grade='C';
        else if(percentage>=40)
            Grade='D';
        else
            Grade='E';
    }
}