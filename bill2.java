import java.util.*;
  class Example{
	public static void main(String args[]){
		Scanner input =new Scanner(System.in);
		 System.out.println("=====================================================================================");
		 System.out.println("_           _   _                             _            _ __  __            _");
		 System.out.println("\\ \\        / / | |                           | |          (_)  \\/  |          | |");
		 System.out.println(" \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___   | |_ ___      _| \\  / | __ _ _ __| |_");
		 System.out.println("  \\ \\/  \\/ / _ \\ |/ __/ __\\| "+"'"+"_ "+"'"+" _ \\ / _ \\  | __/  _ \\   | | |\\/| |/  "+"'"+" | "+"'"+"__| __|");
		 System.out.println("   \\  /\\  /  __/ | (__|(_) | | | | | |  __/  | | | ( ) |  | | |  | | (_| | |  | |_");
		 System.out.println("    \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|   \\__ \\___/   |_|_|  |_|\\__,_|_|   \\__|\n\n");
		 System.out.println("=====================================================================================");
			System.out.print("\nEnter customer phone number - ");
			String phone_num=input.nextLine();
			System.out.print("\nEnter customer Name         - ");
			String Custo_Name=input.nextLine();
			System.out.println("\n=====================================================================================");
			System.out.print("\nBasmathi Qty(kg) - ");
			double basmathi=input.nextDouble();
			System.out.print("\nDhal Qty(kg)     - ");
			double dhal=input.nextDouble();
			System.out.print("\nHigland Qty      - ");
			double higland=input.nextDouble();
			System.out.print("\nSugar Qty(kg)    - ");
			double sugar=input.nextDouble();
			System.out.print("\nyoghurt Qty      - ");
			double yoghurt=input.nextDouble();
			System.out.print("\nFlour Qty(kg)    - ");
			double flour=input.nextDouble();
			System.out.print("\nSoap Qty(kg)     - ");
			double soap=input.nextDouble();
			double Total=(basmathi*250.00)+(dhal*180.00)+(sugar*150.00)+(yoghurt*50.00)+(flour*120.00)+(soap*160.00)+(higland*1200.00);
			double dicount =(double)Total/10.0;
			System.out.println("+------------------------------------------------------------------+");
			System.out.println("|                _   __  __          _____  ________               |");
			System.out.println("|               (_) |  \\/  |   /\\   |  __ \\ __   ___|              |");
			System.out.println("|                _  | \\  / |  /  \\  | |__) |  | |                  |");
			System.out.println("|               | | | |\\/| | / /\\ \\ |  _  /   | |                  |");
			System.out.println("|               | | | |  | |/ ____ \\| | \\ \\   | |                  |");
			System.out.println("|               |_| |_|  |_/_/    \\_\\_|  \\_\\  |_|                  |");
			System.out.println("|                     225,Galle Road,Panadura.                     |");
			System.out.println("+------------------------------------------------------------------+");
			System.out.printf("%s%-15s%s","|                  #Tel   : ",phone_num,"                        |\n");
			System.out.printf("%s%-15s%s","|                  #Name  : ",Custo_Name,"                        |\n");
			System.out.println("+--------------------+---------+--------------------+--------------+");
			System.out.println("|                    |  Qty    |      Unit price    |  Price       |");
			System.out.println("+--------------------+---------+--------------------+--------------+");
			System.out.printf("| %-19s|%6.0f   | %-17.2f  |  %-8.2f    |%s","#Basmathi",basmathi,250.00,(basmathi*250.0),"\n");              
			System.out.println("|                    |         |                    |              |");
			System.out.printf("| %-19s|%6.0f   | %-17.2f  |  %-8.2f    |%s","#Dhal",dhal,180.00,(dhal*180.00),"\n");
			System.out.println("|                    |         |                    |              |");
			System.out.printf("| %-19s|%6.0f   | %-17.2f  |  %-8.2f    |%s","#Suger",sugar,150.00,(sugar*150.00),"\n");
			System.out.println("|                    |         |                    |              |");
			System.out.printf("| %-19s|%6.0f   | %-17.2f  |  %-8.2f    |%s","#Highland",higland,1200.00,(higland*1200.00),"\n");
			System.out.println("|                    |         |                    |              |");
			System.out.printf("| %-19s|%6.0f   | %-17.2f  |  %-8.2f    |%s","#Yoghurt",yoghurt,50.00,(yoghurt*50.00),"\n");
			System.out.println("|                    |         |                    |              |");
			System.out.printf("| %-19s|%6.0f   | %-17.2f  |  %-8.2f    |%s","#Flour",flour,120.00,(flour*120.00),"\n");
			System.out.println("|                    |         |                    |              |");
			System.out.printf("| %-19s|%6.0f   | %-17.2f  |  %-8.2f    |%s","#Soap",soap,160.00,(soap*160.00),"\n");
			System.out.println("|                    |         |                    |              |");
			System.out.println("+--------------------+---------+--------------------+--------------+");
			System.out.printf("%s|%10.2f    |%s","|                              |  Total             ",Total,"\n");                  
			System.out.println("+------------------------------+--------------------+--------------+"); 
			System.out.printf("%s|%10.2f    |%s","|                              |  Discount(%10)     ",dicount,"\n");
			System.out.println("+------------------------------+--------------------+--------------+"); 
			System.out.printf("%s|%10.2f    |%s","|                              |  Price             ",(Total-dicount),"\n");
			System.out.println("+------------------------------+--------------------+--------------+"); 	
			System.out.print("Enter customer amount of cash - ");	
			int cash = input.nextInt();
			double change1 = cash-(Total-dicount);
			double change = change1;
			int Five_thousand =  (int)change/5000;
			change = change%5000;
			int two_thousand =  (int)change/2000;
			change = change%2000;
			int one_thousand =  (int)change/1000;
			change = change%1000;
			int Five_hundred =  (int)change/500;
			change = change%500;
			int one_hundred =  (int)change/100;
			change = change%100;
			int Fifty =  (int)change/50;
			change = change%50;
			int twenty =  (int)change/20;
			change = change%20;
			int ten =  (int)change/10;
			change = change%10;
			int Five =  (int)change/5;
			change = change%5;
			int two =  (int)change/2;
			change = change%2;
			int one =  (int)change/1;
			int No_of_Notes=Five_thousand+two_thousand+one_thousand+Five_hundred+one_hundred+Fifty+twenty;
			int No_of_Coins=ten+Five+two+one;
			System.out.println("     +-------------------+------------------+");
			System.out.printf("     |    %-15s|    %-14.2f|%s","Net Amount",Total,"\n");
			System.out.println("     +-------------------+------------------+");
			System.out.printf("     |    %-15s|    %-14d|%s","Cash",cash,"\n");
			System.out.println("     +-------------------+------------------+");
			System.out.printf("     |    %-15s|    %-14.2f|%s","Cange",change1,"\n");
			System.out.println("     +-------------------+------------------+\n\n");
			System.out.println("     +-------------------+------------------+");
			System.out.printf("     |       %-12s|%10s        |%s","Value","No","\n");
			System.out.println("     +-------------------+------------------+");
			System.out.printf("     |        %-11s|%10d        |%s","5000",Five_thousand,"\n");
			System.out.println("     +-------------------+------------------+");
			System.out.printf("     |        %-11s|%10d        |%s","2000",two_thousand,"\n");
			System.out.println("     +-------------------+------------------+");
			System.out.printf("     |        %-11s|%10d        |%s","1000",one_thousand,"\n");
			System.out.println("     +-------------------+------------------+");
			System.out.printf("     |         %-10s|%10d        |%s","500",Five_hundred,"\n");
			System.out.println("     +-------------------+------------------+");
			System.out.printf("     |         %-10s|%10d        |%s","100",one_hundred,"\n");
			System.out.println("     +-------------------+------------------+");
			System.out.printf("     |          %-9s|%10d        |%s","50",Fifty,"\n");
			System.out.println("     +-------------------+------------------+");
			System.out.printf("     |          %-9s|%10d        |%s","20",twenty,"\n");
			System.out.println("     +-------------------+------------------+");
			System.out.printf("     |          %-9s|%10d        |%s","10",ten,"\n");
			System.out.println("     +-------------------+------------------+");
			System.out.printf("     |           %-8s|%10d        |%s","5",Five,"\n");
			System.out.println("     +-------------------+------------------+");
			System.out.printf("     |           %-8s|%10d        |%s","2",two,"\n");
			System.out.println("     +-------------------+------------------+");
			System.out.printf("     |           %-8s|%10d        |%s","1",one,"\n");
			System.out.println("     +-------------------+------------------+");
			System.out.printf("     |    %-15s|%10d        |%s","No of Notes",No_of_Notes,"\n");
			System.out.println("     +-------------------+------------------+");
			System.out.printf("     |    %-15s|%10d        |%s","No of Coins",No_of_Coins,"\n");
			System.out.println("     +-------------------+------------------+\n\n\n");
			System.out.println("--------------------------------------------------");
			System.out.println("        THANK YOU FOR SHOPPING WITH US");
			System.out.println("--------------------------------------------------");
		}
      } 