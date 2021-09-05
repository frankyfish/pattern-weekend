package patterns.behavioural.visitor;

import patterns.behavioural.visitor.nodes.AuthorityGeoPoint;
import patterns.behavioural.visitor.nodes.CulturalGeoPoint;
import patterns.behavioural.visitor.nodes.GeoPoint;

/**
 * Generic visitor that is used to declare
 * all possible checking methods for different types
 * of geotags
 */
public interface GenericVisitor {
    /**
     * Checks some cultural places on the map, e.g.: Museum, Art gallery etc
     */
    void checkCulturalPoint(CulturalGeoPoint point);

    /**
     * Check some government points (city administration, police station etc).
     */
    void checkAuthorityPoint(AuthorityGeoPoint point);

}
