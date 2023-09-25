package com.mycompany.agency;




public class Staff
{
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 emploees to the staffList

        staffList[0] = new Executive("Ross Hecht", "44 Pine Road", "631-555-1234", "324-12-5678", 50);
        ((Executive)staffList[0]).awardBonus(500.00);

        staffList[1] = new Intern("John", "456 Off Line", "516-555-0101");

        staffList[2] = new StaffEmployee("Tom", "38 Fern Drive", "516-555-6543", "987-91-9009", 20);

        staffList[3] = new TempEmployee("Herb", "20 Tongue Road", "631-555-9999", "312-12-8778", 17);
        ((TempEmployee)staffList[3]).addHours(40);

        staffList[4] = new TempEmployee("Phineas", "300 Train Road", "516-555-7007", "999-23-6525", 17);
        ((TempEmployee)staffList[4]).addHours(30);

        staffList[5] = new Executive("Mike", "55 Oak Road", "631-555-4321", "123-12-5679", 60);
        ((Executive)staffList[5]).awardBonus(700.00);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
