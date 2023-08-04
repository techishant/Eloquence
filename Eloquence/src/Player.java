import javax.sound.sampled.*;

public class Player {
    Player(){
        System.out.println("Player Created");
    }
    public void update(){

    }
    public void play(float frequency, int duration){
        try {
//            duration = (int) (60000/60 * (1.0/duration));
//            duration = 750/4;
//            float frequency = Notes.getFrequency(note);
//            duration = duration/4;
            int sampleRate = 44100; // Common sample rate
            byte[] audioBuffer = new byte[sampleRate * duration / 1000 * 2]; // 2 bytes per sample

//            AudioFormat format = new AudioFormat(sampleRate, 8, 1, true, true);
            AudioFormat format = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, 44100, 16, 1, 2, 44100, false);
            SourceDataLine line = AudioSystem.getSourceDataLine(format);
            line.open(format);
            line.start();

            for (int i = 0; i < audioBuffer.length / 2; i++) {
                double angle = (double) i / sampleRate * frequency * 2.0 * Math.PI;
                short sample = (short) (Short.MAX_VALUE * Math.sin(angle));
                audioBuffer[2 * i] = (byte) (sample & 0xFF);
                audioBuffer[2 * i + 1] = (byte) ((sample >> 8) & 0xFF);
            }

            line.write(audioBuffer, 0, audioBuffer.length);
            line.drain();
            line.close();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}
