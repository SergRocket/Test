import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;


import static java.util.Collections.replaceAll;
import static org.apache.commons.lang3.ArrayUtils.swap;


public class AlgTraining {


    protected WebDriver driver;

   /* @BeforeMethod
    public void beforeLogin() {
        ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
        WebDriverManager.chromedriver().setup();
        driver.set(new ChromeDriver());
    }*/

   /* @AfterMethod
    public void shuttingDown() {
        driver.close();
        if (driver != null) {
            driver.quit();
        }
    }*/

    @Test
    public void waitFor(){
        waitForElement(5, 5);
    }
    public void waitForElement(long wait, long timeToWait){
        long time;
        long timeStop;
        long timeStart = System.currentTimeMillis();
        do {
            try {
                WebElement element = driver.findElement(By.id("#email"));
                Thread.sleep(wait);
                if(element != null){
                    break;
                }} catch (InterruptedException e) {
                e.printStackTrace();
            }
            timeStop = System.currentTimeMillis();
            time = timeStop - timeStart;
        } while (time<timeToWait);
    }



    @Test
    public void score(){
        String [] ops = new String []{"5", "2", "C", "D", "+"};
        List<Integer> resu = new ArrayList<>();
        String filter = ops[0];
        String filter1 = ops[1];
        String filter2 = ops[2];
        String filter3 = ops[3];
        String filter4 = ops[4];
        Arrays.sort(ops);
        for(String op:ops){
            if(op.startsWith(filter)){
                resu.add(Integer.valueOf(op));
            } else if(op.startsWith(filter1)){
                resu.add(Integer.valueOf(op));
            } else if(op.startsWith(filter2)){
                resu.remove(1);
            } else if(op.startsWith(filter3)){
                resu.add(10);
            } else if(op.startsWith(filter4)){
                resu.add(15);
            }
        }
        System.out.print(resu);
        Integer sum = resu.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.print(sum);
        String [] ops2 = new String []{"5", "-2", "4", "C", "D", "9", "+", "+"};
        List<Integer> resu2 = new ArrayList<>();
        String filters = ops2[0];
        String filters1 = ops2[1];
        String filters2 = ops2[2];
        String filters3 = ops2[3];
        String filters4 = ops2[4];
        String filters5 = ops2[5];
        String filters6 = ops2[6];
        Arrays.sort(ops2);
        for(String opi:ops2){
            if(opi.startsWith(filters)){
                resu2.add(Integer.valueOf(opi));
            } else if(opi.startsWith(filters1)){
                resu2.add(Integer.valueOf(opi));
            } else if(opi.startsWith(filters2)){
                resu2.add(Integer.valueOf(opi));
            } else if(opi.startsWith(filters3)){
                resu2.remove(2);
            } else if(opi.startsWith(filters4)){
                resu2.add(-4);
            } else if(opi.startsWith(filters5)){
                resu2.add(9);
            } else if(opi.startsWith(filters6)){
                resu2.add(5);
                resu2.add(14);
            }
        }
        System.out.print(resu);
        Integer sum2 = resu2.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.print(sum2);
        //String string = resu.stream().map(a->a.toString()).collect(Collectors.joining(", "));
        //int recorded = Integer.parseInt(string);
        // System.out.print(string);

    }

    public static int calPoints(String [] ops){
        List<Integer> resu = new ArrayList<>();
        String filter = ops[0];
        String filter1 = ops[1];
        String filter2 = ops[2];
        String filter3 = ops[3];
        String filter4 = ops[4];
        Arrays.sort(ops);
        for(String op:ops){
            if(op.startsWith(filter)){
                resu.add(Integer.valueOf(op));
            } else if(op.startsWith(filter1)){
                resu.add(Integer.valueOf(op));
            } else if(op.startsWith(filter2)){
                resu.remove(1);
            } else if(op.startsWith(filter3)){
                resu.add(10);
            } else if(op.startsWith(filter4)){
                resu.add(15);
            }
        }
        System.out.print(resu);
        Integer sum = resu.stream()
                .reduce(0, (a, b) -> a + b);
        return sum;
    }

    @Test
    public void callMethos(){

    }

    public static void main(String args[]){
        calPoints(new String[]{"5", "2", "C", "D", "+"});
    }

    @Test
    public void waitFors(){
        waitForElements(5, 5);
    }
    public void waitForElements(long wait, long timeToWait){
        long time;
        long timeStop;
        long timeStart = System.currentTimeMillis();
        do {
            try {
                WebElement element = driver.findElement(By.id("#email"));
                Thread.sleep(wait);
                if(element != null){
                    break;
                }} catch (InterruptedException e) {
                e.printStackTrace();
            }
            timeStop = System.currentTimeMillis();
            time = timeStop - timeStart;
        } while (time<timeToWait);
    }

    public static void ramdomInt(int max, int min){
        Random random = new Random();
        int n = max - min - 1;
        int i = random.nextInt() %n;
        int result = min +i;
        System.out.println(result);
    }

    public static void ramdomInt(int max, int min, String message){
        int difference = max - min;
        Random random = new Random();
        int result = random.nextInt(difference+1)+min;
        System.out.println(message);
        System.out.println(result);
    }

    public static void ramdomInt(int max, int min, String message, String finaly){
        int difference = max - min;
        long n = System.currentTimeMillis();
        int result = (int) (n / difference);
        int finResult = result + min;
        System.out.println(finResult);
    }

    @Test
    public void getRandom(){
        ramdomInt(12,9);
        ramdomInt(10,1, "Random will be: ");
        ramdomInt(1,20,"Number", "IS ");
    }

    public static long findNext(long sqr){
        if(sqr != Math.floor(Math.sqrt(sqr)) * Math.floor(Math.sqrt(sqr))){
            return -1;
        }
        double tmp = Math.sqrt(sqr);
        tmp++;
        return Math.round(tmp*tmp);

    }

    @Test
    public void callSqr(){
        findNext(121);
    }

    public static String getUniq(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        sb.append(s1).append(s2);
        String s3 = sb.toString();
        String res = "";
        for(int i = 0; i<s3.length(); i++){
            if(!res.contains(String.valueOf(s3.charAt(i)))){
                res +=s3.charAt(i);
            }
        }
        char[] chars = res.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars);
        return String.valueOf(chars);
    }

    @Test
    public void getUnique(){
        getUniq("fdsfsd", "etyet");
        Assert.assertEquals("abcdefghilnoprstu", getUniq("loopingisfunbutdangerous", "lessdangerousthancoding"));
        Assert.assertEquals("aehrsty", getUniq("aretheyhere", "yestheyarehere"));
        Assert.assertEquals("aehrsty", getUniq("aretheyhere", "yestheyarehere"));

    }

    public static String[] splitStr(String st){
        if (st.length()==0) return new String[0];

        // if not even, then add an underscore to the end
        if (st.length()%2!=0) {
            st+="_";
        }

        // determine the space needed for the return array
        int spaceNeeded = st.length()/2;

        // create a new array to populate and return
        String[] out = new String[spaceNeeded];

        // create an builder index
        int j = 0;

        // loop through the input string
        for (int i=0; i<st.length(); i++) {

            // create a new string to build
            StringBuilder sb = new StringBuilder();
            // add the current item
            sb.append(st.charAt(i));
            // add the next item
            sb.append(st.charAt(i+1));

            // populate our output string as we go
            out[j] = sb.toString();

            // increment both counters
            i++;
            j++;
        }

        // return the built string
        return out;
    }

    static String[] solution(String s) {
        return (s + (s.length() % 2 > 0 ? "_" : "")).split("(?<=\\G.{2})");
    }

    @Test
    public void splitStr(){
        splitStr("qwerty");
        String s = "abcde";
        Assert.assertEquals("Should handle odd string","[ab, cd, e_]", Arrays.toString(splitStr(s)));
        Assert.assertEquals("Should handle odd string","[ab, cd, e_]", Arrays.toString(splitStr(s)));
    }

    @Test
    public void anotherSplit(){
        solution("wweerpt");
        Assert.assertEquals("Should handle odd string","[ab, cd, e_]", Arrays.toString(solution("abcde")));
    }

    public static String makeReadable(int sec){
        int hourInSec = 3600;
        int minInSec = 60;
        String hh = Integer.toString((sec / hourInSec));
        String mm = Integer.toString((sec % hourInSec) / minInSec);
        String ss = Integer.toString(sec % minInSec);

        if(hh.length()==1){
            hh = "0" +hh;
        }
        if(mm.length()==1){
            mm = "0" + mm;
        }
        if(ss.length()==1){
            ss = "0" + ss;
        }
        return hh + ":" + mm + ":" + ss;
    }

    @Test
    public void mareReadableTime(){
        makeReadable(86399);
        Assert.assertEquals( "00:01:00", makeReadable(60));
    }

    public static String makeReadables(int seconds) {
        int h = seconds/60/60;
        int min = seconds/60%60;
        int sec = seconds%60;
        return String.format("%02d:%02d:%02d",h,min,sec);
    }

    public static int sumOfValuesinArray(int [] B){
        int maxSoFar = 0;
        int maxEndingHere = 0;

        for(int i : B){
            maxEndingHere = maxEndingHere + i;
            maxEndingHere = Integer.max(maxEndingHere, 0);
            maxSoFar = Integer.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    @Test
    public void getSumOfValues(){
        sumOfValuesinArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        Assert.assertEquals(6,sumOfValuesinArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public static int sortDesc(final int num) {
        int sortedNumber = 0;
        for (int i = num; i >= 0; i--) {
            int tmpNumber = num;
            while (tmpNumber > 0) {
                int digit = tmpNumber % 10;
                // Check for the greatest digit in the given number
                if (digit == i) {
                    sortedNumber *= 10;
                    sortedNumber += digit;
                }
                tmpNumber /= 10;
            }
        }
        System.out.println(sortedNumber);
        return sortedNumber;
    }

    @Test
    public void sortNumbers() {
        Assert.assertEquals(51, sortDesc(15));
        Assert.assertEquals(4321, sortDe(1234));
    }


    public static int sortDe(final int num) {
        return Integer.parseInt(String.valueOf(num)
                .chars()
                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));
    }

    public static boolean isIsogram(String str) {
        // clever
        //return str.length() == str.toLowerCase().chars().distinct().count();

        return str.length() == 0 || str.length() ==
                new HashSet<>(Arrays.asList(str.toLowerCase().split(""))).size();
    }

    @Test
    public void checkIsogram() {
        Assert.assertTrue(true, String.valueOf(isIsogram("Dermatoglyphics")));
        Assert.assertTrue(true, String.valueOf(isIsogram("thumbscrewjapingly")));
    }

    public static boolean isIsog(String str) {
        int i, j;
        char[] symb = str.toCharArray();
        Arrays.sort(symb);
        str = str.toLowerCase();
        for (i = 0; i < str.length(); ++i) {
            for (j = i + 1; j < str.length(); ++j) {
                if (symb[i] == symb[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Test
    public void isIS(){
        Assert.assertTrue(true, String.valueOf(isIsog("thumbscrewjapingly")));
    }

    public static int odds(int [] arrayNum){
        List<Integer> odds = new ArrayList<>();
        List<Integer> Noodds = new ArrayList<>();
        StringBuilder st = new StringBuilder();
        for(int i=0; i<arrayNum.length; i++){
            if(arrayNum[i] %2 !=0){
                odds.add(arrayNum[i]);
            }
        }
        for(int i=0; i<arrayNum.length; i++){
            if(arrayNum[i] %2 ==0){
                Noodds.add(arrayNum[i]);
            }
        }
        if(odds.size() > Noodds.size()){
            int[] arr = Noodds.stream().mapToInt(i -> i).toArray();
            for(int i : arr){
                st.append(i);
            }
        } else if(odds.size() < Noodds.size()){
            int[] arrs = odds.stream().mapToInt(i -> i).toArray();
            for(int i : arrs){
                st.append(i);
            }

        }
        System.out.println(Integer.parseInt(st.toString()));
        return Integer.parseInt(st.toString());
    }

    @Test
    public void getOdd(){
        odds(new int[]{34,12,7});
        odds(new int[]{206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781});
        int[] exampleTest1 = {2,6,8,-10,3};
        int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
        Assert.assertEquals(3, odds(new int[]{2,6,8,-10,3}));
        Assert.assertEquals(206847684, odds(new int[]{206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781}));
        Assert.assertEquals(0, odds(exampleTest3));
    }

    public static int find_max(int nums[], int len) {
        int i, max_num = nums[0];
        for (i = 1; i < len; i++)
            if (nums[i] > max_num) {
                // (Fill in the missing line here)
            }
        return max_num;
    }

    @Test
    public void testTask() {
        find_max(new int[]{12, 13, 13}, 12);
    }

    @Test
    public void score??() {
        String[] ops = new String[]{"5", "2", "C", "D", "+"};
        List<Integer> resu = new ArrayList<>();
        String filter = ops[0];
        String filter1 = ops[1];
        String filter2 = ops[2];
        String filter3 = ops[3];
        String filter4 = ops[4];
        Arrays.sort(ops);
        for (String op : ops) {
            if (op.startsWith(filter)) {
                resu.add(Integer.valueOf(op));
            } else if (op.startsWith(filter1)) {
                resu.add(Integer.valueOf(op));
            } else if (op.startsWith(filter2)) {
                resu.remove(1);
            } else if (op.startsWith(filter3)) {
                resu.add(10);
            } else if (op.startsWith(filter4)) {
                resu.add(15);
            }
        }
        System.out.print(resu);
        Integer sum = resu.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.print(sum);
        String[] ops2 = new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"};
        List<Integer> resu2 = new ArrayList<>();
        String filters = ops2[0];
        String filters1 = ops2[1];
        String filters2 = ops2[2];
        String filters3 = ops2[3];
        String filters4 = ops2[4];
        String filters5 = ops2[5];
        String filters6 = ops2[6];
        Arrays.sort(ops2);
        for (String opi : ops2) {
            if (opi.startsWith(filters)) {
                resu2.add(Integer.valueOf(opi));
            } else if (opi.startsWith(filters1)) {
                resu2.add(Integer.valueOf(opi));
            } else if (opi.startsWith(filters2)) {
                resu2.add(Integer.valueOf(opi));
            } else if (opi.startsWith(filters3)) {
                resu2.remove(2);
            } else if (opi.startsWith(filters4)) {
                resu2.add(-4);
            } else if (opi.startsWith(filters5)) {
                resu2.add(9);
            } else if (opi.startsWith(filters6)) {
                resu2.add(5);
                resu2.add(14);
            }
        }
        System.out.print(resu);
        Integer sum2 = resu2.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.print(sum2);
        //String string = resu.stream().map(a->a.toString()).collect(Collectors.joining(", "));
        //int recorded = Integer.parseInt(string);
        // System.out.print(string);
    }

    @Test
    public void getSumOfArray(){
        int [] arr = {2,4,5,7,8};
        int sum = 0;
        for(int value: arr){
            sum += value;
        }
        System.out.println(sum);
    }

    private void fizzBuzzify(int value) {
        if (value % 3 == 0) {
            System.out.println((value % 5 == 0) ? "FizzBuzz" : "Fizz");
        }
        System.out.println((value % 5 != 0) ? "Buzz" : Integer.toString(value));
    }

    @Test
    public void fizzBusTask(){
        fizzBuzzify(45);
    }

    @Test
    public void getDuplic(){
        int numbs[] = {1,1,1,2,5,2,3};
        HashSet<Integer> sets = new HashSet<>();
        List<Integer> dupls = new ArrayList<>();
        for(Integer numb : numbs){
            if(sets.add(numb) == false){
                dupls.add(numb);
            }
        }
        System.out.println("The dupls is: " + dupls);
        System.out.println("The qnt is: " + dupls.size());
    }

    @Test
    public void getDupl(){
        int numbs[] = {1,1,1,2,3,4,2};
        String strs[] = {"Hi", "She", "Hi", "She", "It"};
        HashSet<Integer> sets = new HashSet<>();
        for(int i = 0; i < numbs.length; i++){
            for(int j = i + 1; j < numbs.length; j++){
                if(numbs[i] == (numbs[j])){
                    sets.add(numbs[i]);
                }
            }
        }
        System.out.println("The duplicates are: " + sets);
        System.out.println("The duplicates size is: " + sets.size());
    }

    @Test
    public void getStrDupl(){
        String strs[] = {"Hi", "She", "Hi", "She", "It"};
        HashSet<String> setsStr = new HashSet<>();
        for(int i=0; i < strs.length; i++){
            for(int b = i +1; b<strs.length; b++){
                if(strs[i] == strs[b]){
                    setsStr.add(strs[i]);
                }
            }
        }
        System.out.println("The duplicates are: " + setsStr);
        System.out.println("The duplicates size is: " + setsStr.size());
    }

    @Test
    public void fibanch(){
        int n1 = 0;
        int n2=1;
        int qnt = 9;
        System.out.print(n1 + " " + n2 + " ");
        for(int i=3; i <= qnt; i++){
            int sum = n1 + n2;
            System.out.print(sum + " ");
            n1 = n2;
            n2 = sum;
        }
    }

    @Test
    public void revertArrint(){
        int inters[] = {1,2,3,4,5,6,7,8};
        List<Integer> reverted = new ArrayList<>();
        for(int i= inters.length-1;i>=0; i--){
            reverted.add(inters[i]);
        }
        System.out.println("Reverted " + reverted);
    }

    @Test
    public void isPalindr(){
        //isPalindrs("abcca");
        Assert.assertTrue(isPalindrs("adddd"));
    }

    public boolean isPalindrs(String  s){
        String clean = s.replaceAll("\\s", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length -1;
        while(backward > forward){
            char forwdChar = clean.charAt(forward++);
            char bkwrdChar = clean.charAt(backward--);
            if(forwdChar != bkwrdChar)
                return false;
        }
        return true;
    }

    @Test
    public void getRnd(){
        int max = 5;
        int min = 1;
        int difference = max - min;
        Random rand = new Random();
        int rands = rand.nextInt(difference +1)+min;
        System.out.println(rands);
    }

    @Test
    public void mergeArrays(){
      int [] first = {1,2,3,4,5};
      int [] sec = {6,7,8,9};
      int flength = first.length;
      int slength = sec.length;
      int finlength = flength + slength;
      int [] merged = new int[finlength];
      System.arraycopy(first, 0, merged, 0, flength);
      System.arraycopy(sec, 0, merged, flength, slength);
      for(int i =0; i<merged.length; i++){
          System.out.println(merged[i]);
      }
    }

    @Test
    public void getFactorial(){
        int result = 1;
        int factLimit = 4;
        for(int i=1; i <=factLimit; i++){
            result = result * i;
        }
        System.out.println(result);
    }

    @Test
    public void sortArray(){
        int [] arr = {3,12,45,6,44};
        boolean contin = true;
        while (contin){
            contin = false;
            for(int i = 1; i < arr.length; i++){
                if(arr[i] < arr[i-1]){
                    swap(arr, i, i-1);
                    contin = true;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void convertListToArr(){
        List<Integer> listed = new ArrayList<Integer>();
        listed.add(1);
        listed.add(2);
        int[] arr = new int [listed.size()];
        for(int i = 0; i<arr.length; i++){
            arr[i] = listed.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void getIntsFromArr(){
        List<Integer> list = new ArrayList<>();
        String [] arr = {"Hi", "2", "She", "1", "4", "It"};
        for (int i = 0; i<arr.length; i++){
            try {
                list.add(Integer.parseInt(arr[i]));
            } catch (NumberFormatException n){
                n.printStackTrace();
            }
        }
        System.out.println(list);
    }

    @Test
    public void getSumFromInt(){
        int one = 123;
        String text = Integer.toString(one);
        int sum = 0;
        int len = text.length();
        for(int i = 0; i<len; i++){
            char charAt = text.charAt(i);
            sum = sum + Integer.parseInt(String.valueOf(charAt));
        }
        System.out.println(sum);
    }

    @Test
    public void filterStrGetIntFilterInt() {
        List<Integer> canBeDivided = new ArrayList<>();
        List<Integer> cantBeDivided = new ArrayList<>();
        List<Integer> allInts = new ArrayList<>();
        String given = "1234FB9";
        int len = given.length();
        for (int i = 0; i < len; i++) {
            char charAt = given.charAt(i);
            try {
                allInts.add(Integer.parseInt(String.valueOf(charAt)));
            } catch (NumberFormatException b) {
                b.printStackTrace();
            }
        }
        int sizeAll = allInts.size();
        for (int c = 0; c < sizeAll; c++) {
                    if (allInts.get(c) % 2 != 0) {
                        canBeDivided.add(c);
                    } else if (allInts.get(c) % 2 == 0) {
                        cantBeDivided.add(c);
                    }
                }
        System.out.println(allInts);
        System.out.println(canBeDivided);
        System.out.println(cantBeDivided);
        }


    public boolean isPalindromString(String given){
        String filteredGiven = given.replaceAll("//s", " ").toLowerCase();
        int stringLength = filteredGiven.length();
        int moveForward = 0;
        int moveBackward = stringLength -1;
        while(moveBackward> moveForward){
            char forwardChar = filteredGiven.charAt(moveForward++);
            char backwardChar = filteredGiven.charAt(moveBackward--);
            if(forwardChar != backwardChar){
                return false;
            }
        }
        return true;

     }

     @Test
    public void callMethosToTestPalindrome(){
        Assert.assertTrue(isPalindromString("abccba"));
     }

    public static int sum(int num, int total) {
        if (num == 0) return total;
        total += num % 10;
        return sum(num / 10, total);
    }

    @Test
            public void callRecursio(){
        System.out.println("total: " + sum(123, 0));
    }

    @Test
    public void randomIntWithUnix(){
        long range = System.currentTimeMillis();
        int start = 5;
        int end = 9;
        int difference = end - start;
        int divided = (int) (range / difference %5 + start);
        System.out.println(divided);
    }

    @Test
    public void getIntFromString(){
        String str = "123";
        String filteredGiven = str.replaceAll("//s", " ").toLowerCase();
        for (int i=0; i<str.length(); i++){
            char givenChar = filteredGiven.charAt(i);
            int abc = Character.getNumericValue(givenChar);
            System.out.println(abc);
        }



        int codeInt = 120;
        char charAt = (char) codeInt;
        int getInt = Character.getNumericValue(codeInt);
        System.out.println(getInt);
    }

}
