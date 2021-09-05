package patterns.behavioural.visitor.nodes;

import patterns.behavioural.visitor.GenericVisitor;

public class AuthorityGeoPoint implements GeoPoint {
    @Override
    public void check(GenericVisitor visitor) {
        visitor.checkAuthorityPoint(this);
    }
}
