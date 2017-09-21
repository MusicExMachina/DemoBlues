import form.part.Line;
import form.score.LeadSheet;
import properties.sound.Chord;
import properties.sound.Pitch;
import properties.time.Tempo;
import properties.time.Time;
import properties.time.TimeSig;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Creating a new Blues standard to last the ages!");
        LeadSheet leadSheet = new LeadSheet("MxM Demo lead sheet");

        leadSheet.add(TimeSig.COMMON_TIME, Time.MEASURE_ONE);
        leadSheet.add(Tempo.get(100), Time.MEASURE_ONE);

        Line<Pitch> melody = leadSheet.getTune();
        Line<Chord> chords = leadSheet.getChanges();
    }
}
