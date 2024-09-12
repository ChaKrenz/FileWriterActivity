
import java.io.*;
// import java.nio.file.*;
// import java.nio.charset.StandardCharsets;

public class MyFileWriter {
    public static void main(String[] args) {
        // String data = "Hello, World!";
        // String fileName1 = "example.txt";
        // String fileName2 = "example2.txt";
        // String fileName3 = "example3.txt";
        // String fileName4 = "example4.txt";
        // String fileName5 = "example5.txt";

        //Homework for September 10
        String secretFileName = ".computerpassword.txt";
        try (FileWriter writer = new FileWriter(secretFileName)) {
            writer.write("Password: password123");
        } catch (IOException e) {
            e.printStackTrace();
        }

        File directory = new File (".classified");
        File fileName = new File(directory, "confidential.dat");
        try (Writer writer = new FileWriter(fileName)) {
            writer.write("Secret data");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //print file size prints the length of the file.
    public static void printFileSize(String fileName) {
        //implement my print filesize
        File file = new File(fileName);
        System.out.println("The length of the file is: " + file.length());
    }
}
        

//         // 1. Using FileWriter
//         try (FileWriter writer = new FileWriter(fileName1)) {
//             writer.write(data);
//         } catch (IOException e) {
//             e.printStackTrace();
//         }

//         // 2. Using BufferedWriter
//         try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2))) {
//             bufferedWriter.write(data);
//         } catch (IOException e) {
//             e.printStackTrace();
//         }

//         // 3. Using FileOutputStream
//         try (FileOutputStream outputStream = new FileOutputStream(fileName3)) {
//             outputStream.write(data.getBytes());
//         } catch (IOException e) {
//             e.printStackTrace();
//         }

//         // 4. Using BufferedOutputStream
//         try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileName4))) {
//             bufferedOutputStream.write(data.getBytes());
//         } catch (IOException e) {
//             e.printStackTrace();
//         }

//         // 5. Using Files (java.nio.file)
//         try {
//             Files.write(Paths.get(fileName5), data.getBytes(StandardCharsets.UTF_8));
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }