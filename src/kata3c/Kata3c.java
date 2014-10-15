package kata3c;

public class Kata3c {

    public static void main(String[] args) {
        MailReader reader = new MailReader("mails.txt");
        HistogramBuilder<String> builder = new HistogramBuilder<>();
        Histogram<String> histogram = builder.build(reader.readDomains());
        new HistogramViewer<String>().print(histogram);
    }
    
}
