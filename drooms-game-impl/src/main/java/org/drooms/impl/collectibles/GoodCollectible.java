package org.drooms.impl.collectibles;

import org.drooms.api.Collectible;

public class GoodCollectible implements Collectible {

    private final int expiresInTurn, points;

    public GoodCollectible(final int points, final int expiresInTurn) {
        if (expiresInTurn < 0) {
            throw new IllegalArgumentException(
                    "Expiration must be a positive number.");
        }
        this.expiresInTurn = expiresInTurn;
        this.points = points;
    }

    @Override
    public boolean expires() {
        return (this.expiresInTurn != Integer.MAX_VALUE);
    }

    @Override
    public int expiresInTurn() {
        return this.expiresInTurn;
    }

    @Override
    public int getPoints() {
        return this.points;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("GoodCollectible [expiresInTurn=")
                .append(this.expiresInTurn).append(", points=")
                .append(this.points).append("]");
        return builder.toString();
    }

}
