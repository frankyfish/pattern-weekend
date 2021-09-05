package patterns.behavioural.visitor.nodes;

import patterns.behavioural.visitor.GenericVisitor;

public class CulturalGeoPoint implements GeoPoint {

    @Override
    public void check(GenericVisitor visitor) {
        visitor.checkCulturalPoint(this);
    }
}
