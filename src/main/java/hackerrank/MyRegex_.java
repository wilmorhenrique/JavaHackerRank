package hackerrank;

class MyRegex_{

        public static void main(String[] args){
            String IP = "000.12.12.034";
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }

class MyRegex {
    public String pattern = "\\b((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.|$)){4}\\b";
    //public String pattern = "((\\d|\\d\\d|[0-1]\\d\\d|2[0-4][0-9]|25[0-5])\\.){3}(\\d|\\d\\d|[0-1]\\d\\d|2[0-4][0-9]|25[0-5])";
}