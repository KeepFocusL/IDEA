package day240529;

    /**
     * 任务1：根据文件名，获取文件类型（后缀）
     * <p>
     * 备注：不带 `.`
     */
    public class Task1 {
        public static void main(String[] args) {
            String fileName1 = "MyStringBuilder.java"; // java
            String fileName2 = "My.StringBuilder.java"; // java
            String fileName3 = "abc.txt"; // txt
            String fileName4 = "xyz_.80_i.png"; // png

            // 任务：如何根据文件名，获取文件类型（后缀）
            //
//        getFileExtensionV1(fileName1);
//        getFileExtensionV1(fileName2);
            getFileExtensionV2(fileName2);
//        getFileExtensionV1(fileName3);
//        getFileExtensionV1(fileName4);
            getFileExtensionV2(fileName4);
        }

        private static void getFileExtensionV1(String filename) {
            int i = filename.indexOf(".");
            System.out.println(i);
            System.out.println(filename.substring(i)); // .java
            System.out.println(filename.substring(i + 1)); // java
        }

        private static void getFileExtensionV2(String filename) {
            int i = filename.lastIndexOf(".");
            System.out.println(i);
            System.out.println(filename.substring(i)); // .java
            System.out.println(filename.substring(i + 1)); // java
        }
    }
