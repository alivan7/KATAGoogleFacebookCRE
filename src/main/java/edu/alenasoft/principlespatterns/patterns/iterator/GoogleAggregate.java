package edu.alenasoft.principlespatterns.patterns.iterator;

public class GoogleAggregate implements Aggregate {

    private final GoogleApiClient client;

    public GoogleAggregate() {
        client = new GoogleApiClient();
    }

    @Override
    public Iterator createIterator() {
        return new GoogleUsersIterator(client.getGoogleUsers());
    }
}
