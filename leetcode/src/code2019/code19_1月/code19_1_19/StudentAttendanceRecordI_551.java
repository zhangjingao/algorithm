package code2019.code19_1月.code19_1_19;

/**
 * @author zjg
 * <p> 2019/1/19 14:54 </p>
 */
public class StudentAttendanceRecordI_551 {

    public boolean checkRecord(String s) {
        int aCount = 0;
        int lCount = 0;
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar == 'A') {
                aCount++;
                if (aCount > 1) {
                    return false;
                }
                lCount = 0;
            } else if (aChar == 'L') {
                lCount++;
                if (lCount > 2) {
                    return false;
                }
            } else {
                lCount = 0;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(
                new StudentAttendanceRecordI_551().checkRecord("LALL")
        );
    }
}
