package patterns.behavioural.visitor;

import patterns.behavioural.visitor.nodes.AuthorityGeoPoint;
import patterns.behavioural.visitor.nodes.CulturalGeoPoint;

/**
 * Implementation of a visitor that checks whether certain type
 * of geo-point is open(working).
 */
public class OpenVisitor implements GenericVisitor {

    @Override
    public void checkCulturalPoint(CulturalGeoPoint culturalGeoPoint) {
        System.out.println("Checking whether culture related geo point is open");
    }

    @Override
    public void checkAuthorityPoint(AuthorityGeoPoint geoPoint) {
        System.out.println("Checking whether authority geo point is open");
    }
}
