package customList;

/**
 * Created by Venelin on 17.3.2017 г..
 */
public class CommandInterpreter {

    public void readCommand(String[] commandArgs, CustomList list) {
        String type = commandArgs[0];

        switch (type) {
            case "Add":
                list.add(commandArgs[1]);
                break;
            case "Remove":
                list.remove(Integer.parseInt(commandArgs[1]));
                break;
            case "Contains":
                System.out.println(list.contains(commandArgs[1]));
                break;
            case "Swap":
                list.swap(Integer.parseInt(commandArgs[1]), Integer.parseInt(commandArgs[2]));
                break;
            case "Greater":
                System.out.println(list.countGreaterThan(commandArgs[1]));
                break;
            case "Max":
                System.out.println(list.getMax());
                break;
            case "Min":
                System.out.println(list.getMin());
                break;
            case "Sort":
                Sorter.sort(list);
                break;
            case "Print":
                list.forEach(System.out::println);
                break;
        }
    }
}
