import java.util.*;
class Student extends Subjects
{
    String Roll_no,Name;
    Student()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name of Student");
        Name=sc.nextLine();
        System.out.println("Enter Roll Number of Student (Do not Enter Duplicate Data)");
        Roll_no=sc.next();
        System.out.println("Enter numbers corresponding to the subject selected (Physics and Chemistry are already selected):");
        System.out.println("1:Mathematics\n2:Biology");
        int s1,s2,s3,s4;
        s1=sc.nextInt();
        if(s1<=0||s1>2)
        {
            while(s1<=0||s1>2)
            {
                System.out.println("Please Enter valid option");
                System.out.println("Enter numbers corresponding to the subject selected (Physics and Chemistry are already selected):");
                System.out.println("1:Mathematics\n2:Biology");
                s1=sc.nextInt();
            }
        }
        subs[0]=subs[1]=subs[s1+1]=1;//Physics , Chemistry and choice
        subs[4]=1;//English is Compulsory
        System.out.println("Enter the number corresponding to the subject selected (English is Compulsory and has been selected already):");
        System.out.println("1:Computer\n2:Physical Education");
        s4=sc.nextInt();
        if(s4<=0||s4>2)
        {
            while(s4<=0||s4>2)
            {
                System.out.println("Please Enter valid option");
                System.out.println("Enter the number corresponding to the subject selected (English is Compulsory and has been selected already):");
                System.out.println("1:Computer\n2:Physical Education");
                s4=sc.nextInt();
            }
        }
        subs[s4+4]=1;
        enterMarks();        
        
    }
    void display_details()
    {
        System.out.println("\n\nStudent Name: "+Name+"\t\t Roll Number: "+Roll_no);
        System.out.println("Subject wise Details:\n");
        for(int i=0;i<7;i++)
        {
            if(subs[i]==1)
            {
                if(i==0||i==1||i==3)
                {
                    System.out.println(subjects[i]+":\nMarks in Theory: "+marks[i][0]+"\t\tMarks in Lab: "+marks[i][1]);
                    System.out.println("Total: "+(marks[i][0]+marks[i][1])+"\nGrade in Subject: "+Grade_meanings[grades[i]-'A']+"\n");
                }
                else if(i==2||i==4)
                {
                    System.out.println(subjects[i]+":\nMarks in Theory: "+marks[i][0]);
                    System.out.println("Total: "+marks[i][0]+"\nGrade in Subject: "+Grade_meanings[grades[i]-'A']+"\n");
                }
                else
                {
                    System.out.println(subjects[i]+":\nMarks in Theory: "+marks[i][0]+"\t\tMarks in Practical: "+marks[i][1]);
                    System.out.println("Total: "+(marks[i][0]+marks[i][1])+"\nGrade in Subject: "+Grade_meanings[grades[i]-'A']+"\n");
                }
            }
        }
        System.out.println("\nTotal Marks: "+Total_Marks+"\t\tPercentage: "+super.percentage+"\t\tOverall Grade: "+Grade_meanings[Grade-'A']+"\n");
    }
    void display_highest()
    {

        System.out.println("Details of Student with highest Percentage are->");
        display_details();
    }
}