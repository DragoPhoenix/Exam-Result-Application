import java.util.*;
class Testing 
{
    public static void main(String args[])
    {
        Student obj[]=new Student[100];
        int t=5;
        String inp_str;
        System.out.println("Enter Details of 5 Students");
        for(int i=0;i<5;i++)
            obj[i]=new Student();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Choose Option:");
            System.out.println("1: To display the student details with highest percentage");
            System.out.println("2: To display a record of student on the basis of Roll number");
            System.out.println("3: To Enter more students' details");
            System.out.println("0: To Exit");
            int op=sc.nextInt();
            switch(op)
            {
                case 0:
                    return;
                case 1:
                    int tem=0;
                    double high=-1;
                    for(int i=0;i<t;i++)
                    {
                        if(obj[i].percentage>high)
                        {
                            high=obj[i].percentage;
                            tem=i;
                        }
                    }
                    obj[tem].display_highest();
                    break;
                case 2:
                    System.out.println("Enter Roll number");
                    inp_str=sc.next();
                    int f=0;
                    for(int i=0;i<t;i++)
                    {
                        if(obj[i].Roll_no.equals(inp_str))
                        {
                            obj[i].display_details();
                            f=1;
                            break;
                        }
                    }
                    if(f==0)
                    {
                        System.out.println("Roll number not Found");
                    }
                    break;
                case 3:
                    obj[t]=new Student();
                    t++;
                    break;
                default:
                    System.out.println("Please Enter valid option");
            }
        }
    }
}