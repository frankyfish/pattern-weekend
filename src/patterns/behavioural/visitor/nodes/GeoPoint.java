package patterns.behavioural.visitor.nodes;

import patterns.behavioural.visitor.GenericVisitor;

public interface GeoPoint {

    void check(GenericVisitor visitor);

}
