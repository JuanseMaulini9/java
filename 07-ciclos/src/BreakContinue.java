public class BreakContinue {
  public static void main(String[] args) {
    System.out.println("Palabra brak");
    for (int i = 1; i < 10; i++){
      if(i % 2 == 0){
        System.out.print(i + " ");
        break;
      }
    }
    System.out.println("Palabra continue");
    for(int i = 1; i < 10; i++){
      if(i % 2 == 1){
        continue;
      }
      System.out.print(i + " ");
    }

  }


}


