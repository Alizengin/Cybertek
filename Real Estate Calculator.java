//DO NOT CHANGE
    int propertyPrice = 0; 
		int numberOfBedrooms, garageSpots;
		float metroAccessibility, schoolScore, highwayAccessibility;
		boolean backyard, smoking, garage;
		String houseType;
		Scanner scan = new Scanner(System.in);
		System.out.println("*****************************************");
		System.out.println("* Welcome to the RealEstate calculator! *");
		System.out.println("*****************************************");
   
   
  System.out.println("Enter your property type:");
        String type = scan.nextLine();
        type = type.toLowerCase();



        switch (type){
            case "condo":
                propertyPrice = 50000;
                System.out.println("How many bedrooms do you have?");
                numberOfBedrooms = scan.nextInt();
                propertyPrice += (numberOfBedrooms*30000);
                System.out.println("Do you have a backyard?");
                backyard = scan.nextBoolean();
                System.out.println("Backyard is not available for condo!");
                System.out.println("Do you have garage?");
                garage = scan.nextBoolean();
                if (garage == true){
                    System.out.println("How many spots?");
                    garageSpots = scan.nextInt();
                    if (garageSpots <= 10){
                        propertyPrice += (garageSpots*20000);
                    }else{
                        System.out.println("Pardon, it's not a public parking!");
                    }
                }
                System.out.println("How close is metro station?");
                metroAccessibility = scan.nextFloat();
                if (metroAccessibility < 1 ){
                    propertyPrice += 10000;
                }else if(metroAccessibility >=1 && metroAccessibility <=3){
                    propertyPrice += 5000;
                }else {
                    System.out.println("Something went wrong Line: 47!");
                }
                System.out.println("How close is highway?");
                highwayAccessibility = scan.nextFloat();
                if (highwayAccessibility < 1){
                    propertyPrice += 15000;
                }else if(highwayAccessibility >=1 && highwayAccessibility <=5){
                    propertyPrice += 8000;
                }else if(highwayAccessibility >=5 && highwayAccessibility <=20){
                    propertyPrice += 4000;
                }else{
                    System.out.println("ERROR line 58!");
                }

                System.out.println("What's the rating of nearest school?");
                schoolScore = scan.nextFloat();
                if (schoolScore <=10 && schoolScore >=8){
                    propertyPrice += 45000;
                }else if(schoolScore <8 && schoolScore >= 4){
                    propertyPrice += 20000;
                }else{
                    propertyPrice += 5000;
                }
                System.out.println("Does any of your family members smoking?");
                smoking = scan.nextBoolean();
                if (smoking == true){
                    propertyPrice += -5000;
                }

                System.out.println("Market Report has been generated.");
                System.out.println("Your estimate market price is: "+ propertyPrice);

                break;

            case "townhouse":
                propertyPrice = 75000;
                System.out.println("How many bedrooms do you have?");
                numberOfBedrooms = scan.nextInt();
                propertyPrice += (numberOfBedrooms*30000);
                System.out.println("Do you have a backyard?");
                backyard = scan.nextBoolean();
                if (backyard == true){
                    propertyPrice += 5000;
                }
                System.out.println("Do you have garage?");
                garage = scan.nextBoolean();
                if (garage == true){
                    System.out.println("How many spots?");
                    garageSpots = scan.nextInt();
                    if (garageSpots <= 10){
                        propertyPrice += garageSpots*20000;
                    }else{
                        System.out.println("Pardon, it's not a public parking!");
                    }
                }
                System.out.println("How close is metro station?");
                metroAccessibility = scan.nextFloat();
                if (metroAccessibility < 1 ){
                    propertyPrice += 10000;
                }else if(metroAccessibility >=1 && metroAccessibility <=3){
                    propertyPrice += 5000;
                }else {
                    System.out.println("Something went wrong Line: 47!");
                }
                System.out.println("How close is highway?");
                highwayAccessibility = scan.nextFloat();
                if (highwayAccessibility < 1){
                    propertyPrice += 15000;
                }else if(highwayAccessibility >=1 && highwayAccessibility <=5){
                    propertyPrice += 8000;
                }else if(highwayAccessibility >=5 && highwayAccessibility <=20){
                    propertyPrice += 4000;
                }else{
                    System.out.println("ERROR line 58!");
                }

                System.out.println("What's the rating of nearest school?");
                schoolScore = scan.nextFloat();
                if (schoolScore <=10 && schoolScore >=8){
                    propertyPrice += 45000;
                }else if(schoolScore <8 && schoolScore >= 4){
                    propertyPrice += 20000;
                }else{
                    propertyPrice += 5000;
                }

                System.out.println("Does any of your family members smoking?");
                smoking = scan.nextBoolean();
                if (smoking == true){
                    propertyPrice += -5000;
                }
                System.out.println("Market Report has been generated.");
                System.out.println("Your estimate market price is: "+ propertyPrice);


                break;

            case "single family home":
                propertyPrice = 95000;
                System.out.println("How many bedrooms do you have?");
                numberOfBedrooms = scan.nextInt();
                propertyPrice += (numberOfBedrooms*30000);
                System.out.println("Do you have a backyard?");
                backyard = scan.nextBoolean();
                if (backyard == true){
                    propertyPrice += 5000;
                }
                System.out.println("Do you have garage?");
                garage = scan.nextBoolean();
                if (garage == true){
                    System.out.println("How many spots?");
                    garageSpots = scan.nextInt();
                    if (garageSpots <= 10){
                        propertyPrice += garageSpots*20000;
                    }else{
                        System.out.println("Pardon, it's not a public parking!");
                    }
                }
                System.out.println("How close is metro station?");
                metroAccessibility = scan.nextFloat();
                if (metroAccessibility <= 1 ){
                    propertyPrice += 10000;
                }else if(metroAccessibility >1 && metroAccessibility <=3){
                    propertyPrice += 5000;
                }else {
                    System.out.println("Something went wrong Line: 47!");
                }
                System.out.println("How close is highway?");
                highwayAccessibility = scan.nextFloat();
                if (highwayAccessibility <= 1){
                    propertyPrice += 15000;
                }else if(highwayAccessibility >=1 && highwayAccessibility <=5){
                    propertyPrice += 8000;
                }else if(highwayAccessibility >=5 && highwayAccessibility <=20){
                    propertyPrice += 4000;
                }else{
                    System.out.println("ERROR line 58!");
                }

                System.out.println("What's the rating of nearest school?");
                schoolScore = scan.nextFloat();
                if (schoolScore >=8 && schoolScore ==10){
                    propertyPrice += 45000;
                }else if(schoolScore <8 && schoolScore >= 4){
                    propertyPrice += 20000;
                }else{
                    propertyPrice += 5000;
                }

                System.out.println("Does any of your family members smoking?");
                smoking = scan.nextBoolean();
                if (smoking == true){
                    propertyPrice += -5000;
                }
                System.out.println("Market report has been generated.");
                System.out.println("Your estimate market price is: "+ propertyPrice+"$");


                break;


        }
    
    
  }
