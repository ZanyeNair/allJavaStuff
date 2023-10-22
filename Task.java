import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task {
  private List<List<String>> twoDArrayList = new ArrayList<>();
  private List<String> mun = new ArrayList<>();
  private List<String> sun = new ArrayList<>();
  private List<String> tues = new ArrayList<>();
  private List<String> wed = new ArrayList<>();
  private List<String> thur = new ArrayList<>();
  private List<String> fri = new ArrayList<>();
  private List<String> sat = new ArrayList<>();
  private List<String> toDo = new ArrayList<>();

  public Task(){
    twoDArrayList.add(sun);
    twoDArrayList.add(mun);
    twoDArrayList.add(tues);
    twoDArrayList.add(wed);
    twoDArrayList.add(thur);
    twoDArrayList.add(fri);
    twoDArrayList.add(sat);
    toDo.add("1. Look at all task");
    toDo.add("2. Look at task for a day");
    toDo.add("3. Add task");
    toDo.add("4. Remove task");

  }
  public void toDos(){
    for (int i = 0; i < toDo.size(); i++) {
      System.out.println(toDo.get(i));
    }
  }
  public void allTask() {
    for (List<String> row : twoDArrayList) {
      for (String element : row) {
          System.out.print(row + ": " + element + " ");
      }
      System.out.println();
    }
  }

    

}
