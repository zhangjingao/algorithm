package code2018.code18_8_24_56;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjg
 * <p> 2018/8/24 19:55 </p>
 */
public class MergeIntervals_56 {

    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> intervals1 = new ArrayList<>();
        if (intervals.size() == 0) {
            return intervals;
        }
        for (int i = 0; i < intervals.size(); i++) {
            for (int j = i+1; j < intervals.size(); j++) {
                if (intervals.get(i).start > intervals.get(j).start) {
                    Interval tem = intervals.get(i);
                    intervals.set(i,intervals.get(j));
                    intervals.set(j,tem);
                }
            }
        }
        int min = intervals.get(0).start;
        int max = intervals.get(0).end;
        for (int i = 1; i < intervals.size(); i++) {
            //重叠即合并区间
            if (intervals.get(i).start <= max) {
                max = intervals.get(i).end > max ? intervals.get(i).end : max;
            } else {
                intervals1.add(new Interval(min,max));
                min = intervals.get(i).start;
                max = intervals.get(i).end;
            }
        }
        intervals1.add(new Interval(min,max));
        return intervals1;
    }

    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1,4));
        intervals.add(new Interval(5,6));
        intervals.add(new Interval(7,9));
        intervals.add(new Interval(1,18));
        List<Interval> list = new MergeIntervals_56().merge(intervals);
        list.forEach(l-> {
            System.out.println(l.start+" "+l.end);
        });
    }
}

class Interval {
     int start;
     int end;
     Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
}/*
if ((start <= max+1 && start+1 >= min)
        || (end+1 >= min && end+1 <= max)) {
        min = start > min ? min : start;
        max = end > max ? end : max;
        intervals.remove(i);
        i--;
        } else if ((min+1 >= start && max+1 <= end)
        || (min+1 <= start && max+1 >= end)) {
        min = start > min ? min : start;
        max = end > max ? end : max;
        intervals.remove(i);
        i--;
        }*/