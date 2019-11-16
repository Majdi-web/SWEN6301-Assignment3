using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Driver
{
    enum sex {male=1,female=2};
    enum BloodType { A=1,B=2,AB=3,O=4};

    class Program
    {
       
        static void Main(string[] args)
        {

            string firstname;
            string middlename;
            string lastname;
            int age;
            int weight;
            int height;
          
           for (int i = 0; i < 1000; i++)
            {
                Console.WriteLine("Enter your name: ");
                firstname = Console.ReadLine();

                Console.WriteLine("Enter your Middle Name: ");
                middlename = Console.ReadLine();

                Console.WriteLine("Enter your lastname: ");
                lastname = Console.ReadLine();

                Console.WriteLine("Enter your age: ");
                age = Convert.ToInt32(Console.ReadLine());

                Console.WriteLine("Enter your weight: ");
                weight = Convert.ToInt32(Console.ReadLine());

                Console.WriteLine("Enter your Height: ");
                height = Convert.ToInt32(Console.ReadLine());
              
                Console.WriteLine("enter organdonor");
                bool t = true | OrganDonor();
                Console.WriteLine(t);

                bool f = false | OrganDonor();
                Console.WriteLine(f);
              
                Console.WriteLine("   Pateint: " + firstname + " " + lastname + "  has been successfully processed!");
            }

            bool OrganDonor()
            {
                Console.WriteLine(" OrganDonor is True");
                return true;
            }

            int sexID = 1;
            Console.WriteLine((sex)sexID);
           
            int BloodTypeID = 4;
            Console.WriteLine( (BloodType)BloodTypeID);
            Console.ReadKey();
        }
            
    }
}
