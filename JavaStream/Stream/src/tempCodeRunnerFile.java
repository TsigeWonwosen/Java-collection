   groupByGender.forEach((gender, people1) -> {
     System.out.println(gender);
     people1.forEach(System.out::println);
     System.out.println();
   });