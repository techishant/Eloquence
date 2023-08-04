public class Notes {
    public static float NOTE_A = 440f;
    public static float NOTE_B = 493.88f;
    public static float NOTE_B0 = 30.87f;
    public static float NOTE_B1 = 61.74f;

    public static float NOTE_B2 = 123.47f;


    public static float NOTE_B3 = 246.94f;

    public static float NOTE_B4 = 493.88f;
    public static float NOTE_B5 = 987.77f;

    public static float NOTE_C = 261.63f;
    public static float NOTE_C1 = 32.70f;
    public static float NOTE_C2 = 65.41f;
    public static float NOTE_C3 = 130.81f;


    public static float NOTE_C4 = 261.63f;

    public static float NOTE_D = 293.66f;
    public static float NOTE_D3 = 146.83f;

    public static float NOTE_D4 = 293.66f;

    public static float NOTE_E = 329.64f;
    public static float NOTE_E1 = 41.20f;
    public static float NOTE_E2 = 82.41f;
    public static float NOTE_E5 = 659.26f;

    public static float NOTE_E3 =  164.81f;

    public static float NOTE_E4 = 329.63f ;

    public static float NOTE_F = 349.23f;
    public static float NOTE_F1 = 43.65f;
    public static float NOTE_F2 = 87.31f;

    public static float NOTE_F3 = 176.61f;

    public static float NOTE_G = 392f;
    public static float NOTE_G1 = 48.99f;

    public static float NOTE_G3 = 196f;
    public static float NOTE_GS1 = 51.91f;
    public static float NOTE_GS3 = 207.65f;



    public static float NOTE_AS4 = 466.16f;  // A#4
    public static float NOTE_D5 = 587.33f;   // D5
    public static float NOTE_C5 = 523.25f;   // C5
    public static float NOTE_F5 = 698.46f;   // F5
    public static float NOTE_G5 = 783.99f;   // G5
    public static float NOTE_A4 = 440.00f;   // A4
    public static float NOTE_F4 = 349.23f;   // F4
    public static float NOTE_G4 = 392.00f;   // G4
    public static float NOTE_AS5 = 932.33f;  // A#5
    public static float NOTE_A5 = 880.00f;   // A5
    public static float NOTE_CS4 = 277.18f;   // C#4 / Db4
    public static float NOTE_DS4 = 311.13f;   // D#4 / Eb4
    public static float NOTE_FS4 = 369.99f;   // F#4 / Gb4
    public static float NOTE_GS4 = 415.30f;   // G#4 / Ab4


    public static float getFrequency(char ch){
        switch (ch){
            case 'A': return NOTE_A;
            case 'B': return NOTE_B;
            case 'C': return NOTE_C;
            case 'D': return NOTE_D;
            case 'E': return NOTE_E;
            case 'F': return NOTE_F;
            case 'G': return NOTE_G;
            default:
                System.out.println("getFrequency default case Activated: ");
                System.out.println("Character Received: " + ch);
                return 0.0f;
        }
    }
}
