package code18_11_13_57;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjg
 * <p> 2018/11/13 21:11 </p>
 */
public class InsertInterval_57 {

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        if (intervals.size() == 0) {
            intervals.add(newInterval);
            return intervals;
        }

        int start = newInterval.start;
        int end = newInterval.end;

        for (int i = 0; i < intervals.size(); i++) {
            int startTemp = intervals.get(i).start;
            int endTemp = intervals.get(i).end;
            if (start >= startTemp && start <= endTemp) {
                if (end <= endTemp) {
                    continue;
                }
                intervals.remove(i);
                for (int j = i; j < intervals.size(); j++) {
                    int startTwo = intervals.get(j).start;
                    int endTwo = intervals.get(j).end;
                    if (end < startTwo) {
                        Interval interval = new Interval(startTemp, end);
                        intervals.add(i, interval);
                        break;
                    } else if (end >= startTwo && end <= endTwo) {
                        Interval interval = new Interval(startTemp, endTwo);
                        intervals.remove(j);
                        intervals.add(i, interval);
                        break;
                    } else {
                        //都不是都删掉
                        intervals.remove(j--);
                    }
                }
                break;
            }
            if (start <= startTemp) {
                for (int j = i; j < intervals.size(); j++) {
                    int startTwo = intervals.get(j).start;
                    int endTwo = intervals.get(j).end;
                    if (end < startTwo) {
                        Interval interval = new Interval(start, end);
                        intervals.add(i, interval);
                        break;
                    } else if (end == startTwo || end <= endTwo) {
                        Interval interval = new Interval(start, endTwo);
                        intervals.remove(j);
                        intervals.add(i, interval);
                        break;
                    } else {
                        //都不是都删掉
                        intervals.remove(j--);
                    }
                }
                break;
            }

        }
        intervals.forEach(l->{
            System.out.println(l.start+" "+l.end);
        });
        return intervals;
    }

    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<>();
/*
        Interval interval1 = new Interval(1,2);
        Interval interval2 = new Interval(3,5);
        Interval interval3 = new Interval(6,7);
        Interval interval4 = new Interval(8,10);
        Interval interval5 = new Interval(12,16);
        Interval interval = new Interval(4,8);
*/
        Interval interval4 = new Interval(1,5);
//        Interval interval5 = new Interval(6,9);
        Interval interval = new Interval(2,7);


//        intervals.add(interval1);
//        intervals.add(interval2);
//        intervals.add(interval3);
        intervals.add(interval4);
//        intervals.add(interval5);
        System.out.println(
                new InsertInterval_57().insert(intervals, interval)
        );
    }

}

class Interval {
     int start;
     int end;
     Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
}