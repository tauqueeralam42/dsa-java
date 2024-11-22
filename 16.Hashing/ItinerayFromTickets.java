import java.util.HashMap;

public class ItinerayFromTickets {

    public static void main(String[] args){
        String[][] tickets = {{"MUC", "LHR"}, {"JFK", "MUC"}, {"SFO", "SJC"}, {"LHR", "SFO"}};

        HashMap<String, String> map = new HashMap<>();
        for(String[] ticket: tickets){
            map.put(ticket[0], ticket[1]);
        }

        String start = "";
        for(String[] ticket: tickets){
            if(!map.containsValue(ticket[0])){
                start = ticket[0];
                break;
            }
        }

        String destination = map.get(start);
        System.out.print(start+" -> ");
        while(map.containsKey(destination)){
            System.out.print(destination+" -> ");
            destination = map.get(destination);
        }
        System.out.print(destination);
    }
    
}
