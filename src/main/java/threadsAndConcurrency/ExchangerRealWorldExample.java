package threadsAndConcurrency;
import java.util.concurrent.Exchanger;
import java.io.*;

class FileReaderTask implements Runnable {
    private Exchanger<String> exchanger;
    private BufferedReader reader;
    private String data;

    public FileReaderTask(Exchanger<String> exchanger, String filePath) throws IOException {
        this.exchanger = exchanger;
        this.reader = new BufferedReader(new FileReader(filePath));
    }

    @Override
    public void run() {
        try {
            while ((data = reader.readLine()) != null) {
                // Simulate data processing (e.g., parsing)
                System.out.println("FileReaderTask: Read data - " + data);
                data = processLine(data);

                // Exchange processed data with WriterTask
                data = exchanger.exchange(data);
            }

            // Close file reader
            reader.close();
            // Signal no more data (End of file)
            exchanger.exchange(null);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private String processLine(String line) {
        // Simulate processing, e.g., parsing or cleaning
        return line.toUpperCase();
    }
}

class FileWriterTask implements Runnable {
    private Exchanger<String> exchanger;
    private BufferedWriter writer;
    private String data;

    public FileWriterTask(Exchanger<String> exchanger, String filePath) throws IOException {
        this.exchanger = exchanger;
        this.writer = new BufferedWriter(new FileWriter(filePath));
    }

    @Override
    public void run() {
        try {
            while (true) {
                // Exchange raw data from FileReaderTask
                data = exchanger.exchange("");

                if (data == null) {
                    // No more data to process (EOF reached)
                    break;
                }

                // Simulate further processing (e.g., compressing data)
                System.out.println("FileWriterTask: Processing data - " + data);
                data = compressData(data);

                // Write the final data to file
                writer.write(data);
                writer.newLine();
            }

            // Close file writer
            writer.close();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private String compressData(String data) {
        // Simulate data transformation (e.g., compression)
        return "Compressed[" + data + "]";
    }
}

public class ExchangerRealWorldExample {
    public static void main(String[] args) throws IOException {
        Exchanger<String> exchanger = new Exchanger<>();

        // File paths
        String inputFilePath = "input.txt";  // Input file containing raw data
        String outputFilePath = "output.txt"; // Output file where processed data is saved

        // Create and start FileReaderTask and FileWriterTask threads
        Thread fileReaderThread = new Thread(new FileReaderTask(exchanger, inputFilePath));
        Thread fileWriterThread = new Thread(new FileWriterTask(exchanger, outputFilePath));

        fileReaderThread.start();
        fileWriterThread.start();
    }
}

