package LearnStructures;

import java.util.*;

public class HashMap {




    public static void main(String[] args) {
        Map<String, Integer> clientsId = new java.util.HashMap<>();

        clientsId.put("Arthur", 101);
        clientsId.put("Artem", 102);
        clientsId.replace("Artem", 54);

        clientsId.put("Kirill", 303);
        clientsId.remove("Artem");
        System.out.println(clientsId);

        int kirillId = clientsId.get("Kirill");
        System.out.println(kirillId);
    }
}
