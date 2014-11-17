package de.tuberlin.dima.schubotz.cpa.types;

import de.tuberlin.dima.schubotz.cpa.WikiSim;
import org.apache.flink.api.java.tuple.Tuple2;

public class LinkTuple extends Tuple2<String, String> {
    public void LinkTuple() {

    }

    public void LinkTuple(String first, String second) {
        setFirst(first);
        setSecond(second);
    }

    public void setFirst(String first) {
        setField(first, 0);
    }

    public void setSecond(String second) {
        setField(second, 1);
    }

    @Override
    public String toString() {
        return String.valueOf(getField(0)) + WikiSim.csvFieldDelimiter + String.valueOf(getField(1));
    }
}
