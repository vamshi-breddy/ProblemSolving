package com.DSAlgo.GoldmanSachs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Given a list of logs with IP addresses in the following format.
//lines = ["10.0.0.1 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20"]
//
//Return the most frequent IP address from the logs. The returned
// IP address value must be in a string format. If multiple IP addresses have the count equal to max count,
// then return the address as a comma-separated string with IP addresses in sorted order.
public class MostFrequentIPAddressFromLogs {

    public static void main(String[] args) {
        String []lines = {"10.0.0.1 - GET 2020-08-24", "10.0.0.1 - GET 2020-08-24", "10.0.0.2 - GET 2020-08-20","255.0.0.2 - GET 2020-08-20",
        "255.0.0.2 - GET 2020-08-20","10.0.0.1 - GET 2020-08-24"};

        findTopIpAddress(lines);
    }

    private static void findTopIpAddress(String[] lines) {
        List ips = Arrays.stream(lines).map(s -> s.split(",")).map(s -> s[0]).collect(Collectors.toList());
        Map<String, Integer> store = new HashMap<>();
        for(int i=0;i<ips.size();i++){
            store.put((String) ips.get(i),store.getOrDefault(ips.get(i),0)+1);
        }
        int max =Integer.MIN_VALUE;
        for(Map.Entry map:store.entrySet()){
            max = Math.max(max, (Integer) map.getValue());
        }

        int finalMax = max;
        System.out.println(store.entrySet().stream().filter(e -> e.getValue() == finalMax).findFirst().get().getKey());


    }

}
