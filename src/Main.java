import java.util.*;

public class Main {
    static class Pair{
        String first;
        String second;
        public Pair(String first, String second){
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {
        HashMap<Pair, Double> mainLine = new LinkedHashMap<>();
        HashMap<Pair, Double> eastWestLine = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);

        mainLine.put(new Pair("Dakshineshwar (KDSW)", "Baranagar (KBAR)"), 1.76);
        mainLine.put(new Pair("Baranagar (KBAR)", "Noapara (KNAP)"), 2.379);
        mainLine.put(new Pair("Noapara (KNAP)", "Dum Dum (KDMI)"), 2.091);
        mainLine.put(new Pair("Dum Dum (KDMI)", "Belgachia (KBEL)"), 2.151);
        mainLine.put(new Pair("Belgachia (KBEL)", "Shyambazar (KSHY)"), 1.625);
        mainLine.put(new Pair("Shyambazar (KSHY)", "Shovabazar Sutanuti (KSHO)"), 0.928);
        mainLine.put(new Pair("Shovabazar Sutanuti (KSHO)", "Girish Park (KGPK)"), 1.01);
        mainLine.put(new Pair("Girish Park (KGPK)", "Mahatma Gandhi Road (KMHR)"), 0.766);
        mainLine.put(new Pair("Mahatma Gandhi Road (KMHR)", "Central (KCEN)"), 1.037);
        mainLine.put(new Pair("Central (KCEN)", "Chandani Chowk (KCWC)"), 0.597);
        mainLine.put(new Pair("Chandani Chowk (KCWC)", "Esplanade (KESP)"), 0.705);
        mainLine.put(new Pair("Esplanade (KESP)", "Parkstreet (KPSK)"), 0.808);
        mainLine.put(new Pair("Parkstreet (KPSK)", "Maidan (KMDI)"), 0.727);
        mainLine.put(new Pair("Maidan (KMDI)", "Rabindra Sadan (KRSD)"), 1.016);
        mainLine.put(new Pair("Rabindra Sadan (KRSD)", "Netaji Bhawan (KNBN)"), 0.848);
        mainLine.put(new Pair("Netaji Bhawan (KNBN)", "Jatin Das Park (KJPK)"), 1.033);
        mainLine.put(new Pair("Jatin Das Park (KJPK)", "Kalighat (KKHG)"), 0.621);
        mainLine.put(new Pair("Kalighat (KKHG)", "Rabindra Sarobar (KRSB)"), 1.243);
        mainLine.put(new Pair("Rabindra Sarobar (KRSB)", "Mahanayak Uttam Kumar (KMUK)"), 1.299);
        mainLine.put(new Pair("Mahanayak Uttam Kumar (KMUK)", "Netaji (KNTJ)"), 1.859);
        mainLine.put(new Pair("Netaji (KNTJ)", "Masterda Surya Sen (KMSN)"), 1.711);
        mainLine.put(new Pair("Masterda Surya Sen (KMSN)", "Gitanjali (KGTN)"), 1.0641);
        mainLine.put(new Pair("Gitanjali (KGTN)", "Kavi Nazrul (KKNZ)"), 1.245);
        mainLine.put(new Pair("Kavi Nazrul (KKNZ)", "Shahid Khudiram (KSKD)"), 1.275);
        mainLine.put(new Pair("Shahid Khudiram (KSKD)", "Kavi Subhas (KKVS)"), 1.576);

        // creating edge for main line
        HashMap<String,String> edgeMain = new HashMap<>();
        edgeMain.put("Dakshineshwar (KDSW)", "Baranagar (KBAR)");
        edgeMain.put("Baranagar (KBAR)", "Noapara (KNAP)");
        edgeMain.put("Noapara (KNAP)", "Dum Dum (KDMI)");
        edgeMain.put("Dum Dum (KDMI)", "Belgachia (KBEL)");
        edgeMain.put("Belgachia (KBEL)", "Shyambazar (KSHY)");
        edgeMain.put("Shyambazar (KSHY)", "Shovabazar Sutanuti (KSHO)");
        edgeMain.put("Shovabazar Sutanuti (KSHO)", "Girish Park (KGPK)");
        edgeMain.put("Girish Park (KGPK)", "Mahatma Gandhi Road (KMHR)");
        edgeMain.put("Mahatma Gandhi Road (KMHR)", "Central (KCEN)");
        edgeMain.put("Central (KCEN)", "Chandani Chowk (KCWC)");
        edgeMain.put("Chandani Chowk (KCWC)", "Esplanade (KESP)");
        edgeMain.put("Esplanade (KESP)", "Parkstreet (KPSK)");
        edgeMain.put("Parkstreet (KPSK)", "Maidan (KMDI)");
        edgeMain.put("Maidan (KMDI)", "Rabindra Sadan (KRSD)");
        edgeMain.put("Rabindra Sadan (KRSD)", "Netaji Bhawan (KNBN)");
        edgeMain.put("Netaji Bhawan (KNBN)", "Jatin Das Park (KJPK)");
        edgeMain.put("Jatin Das Park (KJPK)", "Kalighat (KKHG)");
        edgeMain.put("Kalighat (KKHG)", "Rabindra Sarobar (KRSB)");
        edgeMain.put("Rabindra Sarobar (KRSB)", "Mahanayak Uttam Kumar (KMUK)");
        edgeMain.put("Mahanayak Uttam Kumar (KMUK)", "Netaji (KNTJ)");
        edgeMain.put("Netaji (KNTJ)", "Masterda Surya Sen (KMSN)");
        edgeMain.put("Masterda Surya Sen (KMSN)", "Gitanjali (KGTN)");
        edgeMain.put("Gitanjali (KGTN)", "Kavi Nazrul (KKNZ)");
        edgeMain.put("Kavi Nazrul (KKNZ)", "Shahid Khudiram (KSKD)");
        edgeMain.put("Shahid Khudiram (KSKD)", "Kavi Subhas (KKVS)");


        // East West Line filling
        eastWestLine.put(new Pair("Salt Lake Sector V (SVSA)", "Karunamoyee (KESA)"), 1.228);
        eastWestLine.put(new Pair("Karunamoyee (KESA)", "Central Park (CPSA)"), 0.804);
        eastWestLine.put(new Pair("Central Park (CPSA)", "City Center (CCSC)"), 0.905);
        eastWestLine.put(new Pair("City Center (CCSC)", "Bengal Chemical (BCSD)"), 1.148);
        eastWestLine.put(new Pair("Bengal Chemical (BCSD)", "Salt Lake Stadium (SSSA)"), 0.795);
        eastWestLine.put(new Pair("Salt Lake Stadium (SSSA)", "Phool Bagan (PBSA)"), 1.665);
        eastWestLine.put(new Pair("Phool Bagan (PBSA)", "Sealdah (SDHA)"), 2.34);

        // creatig edge for East West Line

        HashMap<String , String> edgeEastWest = new HashMap<>();
        edgeEastWest.put("Salt Lake Sector V (SVSA)", "Karunamoyee (KESA)");
        edgeEastWest.put("Karunamoyee (KESA)", "Central Park (CPSA)");
        edgeEastWest.put("Central Park (CPSA)", "City Center (CCSC)");
        edgeEastWest.put("City Center (CCSC)", "Bengal Chemical (BCSD)");
        edgeEastWest.put("Bengal Chemical (BCSD)", "Salt Lake Stadium (SSSA)");
        edgeEastWest.put("Salt Lake Stadium (SSSA)", "Phool Bagan (PBSA)");
        edgeEastWest.put("Phool Bagan (PBSA)", "Sealdah (SDHA)");



        HashMap<String,Integer> slMain = new HashMap<>();
        HashMap<String,Integer> slEastWest = new HashMap<>();
        // storing serial no to stations main line
        int idx = 1;
        for(Map.Entry<Pair,Double>entry: mainLine.entrySet()){
            String st = entry.getKey().first;
            slMain.put(st,idx);
            idx++;
        }
        String st1 = mainLine.entrySet().stream().reduce((one,two)->two).get().getKey().second;
        slMain.put(st1,idx);


        // storing serial no to stations east west line
        idx = 1;
        for(Map.Entry<Pair,Double>entry: eastWestLine.entrySet()){
            String st = entry.getKey().first;
            slEastWest.put(st,idx);
            idx++;
        }
        String st2 = eastWestLine.entrySet().stream().reduce((one,two)->two).get().getKey().second;
        slEastWest.put(st2,idx);

//        System.out.println(sortestDistance("Dakshineshwar (KDSW)", "Kavi Subhas (KKVS)",mainLine,edgeMain));
//        System.out.println(sortestDistance("Salt Lake Sector V (SVSA)","Central Park (CPSA)",eastWestLine,edgeEastWest));

        while (true){
            System.out.println("              ******WELCOME TO THE KOLKATA METRO APP*******            ");
            System.out.println("                         **LIST OF ACTIONS******                        ");
            System.out.println();
            System.out.println("1. LIST ALL THE STATIONS IN THE MAP");
            System.out.println("2. SHOW THE METRO MAP");
            System.out.println("3. GET SHORTEST DISTANCE FROM A 'SOURCE' STATION TO 'DESTINATION' STATION");
            System.out.println("4. GET SHORTEST TIME TO REACH FROM A 'SOURCE' STATION TO 'DESTINATION' STATION");
            System.out.println("5. EXIT THE MENU");
            System.out.print("\nENTER YOUR CHOICE FROM THE ABOVE LIST (1 to 5) : ");

            int choice = sc.nextInt();
            if(choice==5){
                System.exit(0);
            }
            switch (choice){
                case 1:
                    System.out.println("1. Main Line");
                    System.out.println("2. East West Line");
                    int l1 = sc.nextInt();
                    if(l1==1)
                        printAllStationMainLine(mainLine);
                    else if(l1==2)
                        printAllStationEastWestLine(eastWestLine);
                    else
                        System.out.println("Invalid Inputs..");
                    break;
                case 2:
                    System.out.println("1. Main Line");
                    System.out.println("2. East West Line");
                    int l2 = sc.nextInt();
                    if(l2==1)
                        mapOfMainLine(mainLine);
                    else if(l2==2)
                        mapOfEastWestLine(eastWestLine);
                    else
                        System.out.println("Invalid Input...");
                    break;
                case 3:
                    System.out.println("1. Main Line");
                    System.out.println("2. East West Line");
                    int l3 = sc.nextInt();
                    if(l3==1){
                        printAllStationMainLine(mainLine);
                        System.out.println("Enter source: ");
                        String src = sc.next();
                        System.out.println("Enter destination: ");
                        String des = sc.next();
//                        System.out.println(src+" "+des);
                        double dis = sortestDistance(src,des,mainLine,edgeMain);
                        System.out.println("The Sortest Distance between "+src+" to "+des+" is: "+dis+"km");
                    }
                    else if(l3==2){
                        printAllStationEastWestLine(eastWestLine);
                        System.out.println("Enter source: ");
                        String src = sc.next();
                        System.out.println("Enter destination: ");
                        String des = sc.next();
                        double dis = sortestDistance(src,des,eastWestLine,edgeEastWest);
                        System.out.println("The Sortest Distance between "+src+" to "+des+" is: "+dis+"km");
                    }
                    else
                        System.out.println("Invalid Inputs...");
                    break;
                case 4:
                    System.out.println("1. Main Line ");
                    System.out.println("2. East West Line");
                    int l4 = sc.nextInt();
                    if(l4==1){
                        printAllStationMainLine(mainLine);
                        System.out.println("Enter source: ");
                        String src = sc.next();
                        System.out.println("Enter destination: ");
                        String des = sc.next();
                        double dis = sortestDistance(src,des,mainLine,edgeMain);
                        System.out.println("The Sortest Distance between "+src+" to "+des+" is: "+dis+"km");
                    }
                    else if(l4==2){
                        printAllStationEastWestLine(eastWestLine);
                        System.out.println("Enter source: ");
                        String src = sc.next();
                        System.out.println("Enter destination: ");
                        String des = sc.next();
                        double dis = sortestDistance(src,des,eastWestLine,edgeEastWest);
                        int t = (int)dis;
                        System.out.println("The minimum Time between "+src+" to "+des+" is: "+t*3+"minutes");
                    }
                    else
                        System.out.println("Invalid Inputs...");
                    break;
                default:
                    System.out.println("Please Enter a Valid Option");
                    System.out.println("The option you can choose from 1 to 5 ..");
            }
        }


    }

    private static void printAllStationMainLine(HashMap<Pair, Double> mainLine){
        System.out.println();
        System.out.println("List of All Stations of Main Line....");
        int idx = 1;
        for(Map.Entry<Pair,Double>entry: mainLine.entrySet()){
            System.out.println((idx++)+". "+entry.getKey().first);
        }
        System.out.println(idx+". "+mainLine.entrySet().stream().reduce((one,two)->two).get().getKey().second);
    }
    private static void printAllStationEastWestLine(HashMap<Pair, Double> eastWestLine){
        System.out.println();
        System.out.println("List of All Stations of East West Line.... ");
        int idx = 1;
        for(Map.Entry<Pair,Double>entry: eastWestLine.entrySet()){
            System.out.println((idx++)+". "+entry.getKey().first);
        }
        System.out.println(idx+". "+eastWestLine.entrySet().stream().reduce((one,two)->two).get().getKey().second);
    }
    private static void mapOfMainLine(HashMap<Pair, Double> mainLine){
        System.out.println();
        System.out.println("<-------------------------------- Main Line Map --------------------------->");
        System.out.println();
        for (HashMap.Entry<Pair, Double> entry : mainLine.entrySet()) {
            System.out.println(entry.getKey().first + " -> " + entry.getKey().second + "  , dist: " + entry.getValue() + "km");
            System.out.println("------------------------------------------------------------------------");
        }
    }
    private static void mapOfEastWestLine(HashMap<Pair, Double> eastWestLine) {
        System.out.println();
        System.out.println("<------------------------------ East West Line Map ----------------------->");
        System.out.println();
        for (HashMap.Entry<Pair, Double> entry : eastWestLine.entrySet()) {
            System.out.println(entry.getKey().first + " -> " + entry.getKey().second + "  , dist: " + entry.getValue() + "km");
            System.out.println("------------------------------------------------------------------------");
        }
    }
    private static double sortestDistance(String src , String des , HashMap<Pair, Double> graph, HashMap<String,String> edge) {
        double distance = 0;
        Queue<String> q = new LinkedList<>();
        q.add(src);
        while (!q.isEmpty()){
            String first = q.poll();
            if(first==des) break;

            String second = edge.get(first);
            q.add(second);

            for(Map.Entry<Pair,Double> entry: graph.entrySet()){
                String s1 = entry.getKey().first;
                String s2 = entry.getKey().second;
                if(s1==first && s2 ==second) {
                    distance+= entry.getValue();
                    break;
                }
            }
        }
        return distance;
    }

}