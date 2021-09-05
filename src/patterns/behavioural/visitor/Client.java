package patterns.behavioural.visitor;

import patterns.behavioural.visitor.nodes.AuthorityGeoPoint;
import patterns.behavioural.visitor.nodes.CulturalGeoPoint;
import patterns.behavioural.visitor.nodes.GeoPoint;

/**
 * Consider a map application which has some geo-points on the map.
 * These geo-points are of different types all of them implement {@link GeoPoint}.
 *
 * We don't want to mix up the objects with logic which performs some action on them.
 * This might lead to coupling.
 * We also don't want to have a single class which performs some actions based on the sub-type of {@link GeoPoint}
 * of the object passed to it. This might result in an ugly if-else-if construction.
 *
 * Instead each {@link GeoPoint} implementation allows a {@link GenericVisitor} implementation to `visit` it
 * in order to perform some business logic.
 */
public class Client {
    public static void main(String[] args) {
        // create concrete instance of the visitor
        // to check certain thing(whether point on the map is open)
        GenericVisitor openVisitor = new OpenVisitor();

        // we have to 2 different objects
        // and single object which performs some logic on them(in this case checking)
        GeoPoint museum = new CulturalGeoPoint();
        museum.check(openVisitor);
        GeoPoint fireFightersStation = new AuthorityGeoPoint();
        fireFightersStation.check(openVisitor); // visiting an object with visitor

        // we can easily add new criteria
        GenericVisitor markAsClosed = new MarkClosedVisitor();
        museum.check(markAsClosed); // visiting an object with visitor
    }
}
