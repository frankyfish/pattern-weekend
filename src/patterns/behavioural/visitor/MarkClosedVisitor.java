package patterns.behavioural.visitor;

import patterns.behavioural.visitor.nodes.AuthorityGeoPoint;
import patterns.behavioural.visitor.nodes.CulturalGeoPoint;

public class MarkClosedVisitor implements GenericVisitor {

    private String message = "Marking geo-point=%s as closed.";

    @Override
    public void checkCulturalPoint(CulturalGeoPoint point) {
        System.out.printf(message, point);
    }

    @Override
    public void checkAuthorityPoint(AuthorityGeoPoint point) {
        System.out.printf(message, point);
    }
}
