package vii_realworld._0__Immutability;

import java.util.Objects;

public final class ImmutableObject {

    private final String foo;
    private final String bar;
    private final String foobar;

    private ImmutableObject(final String foo, final String bar, final String foobar) {
        this.foo = foo;
        this.bar = bar;
        this.foobar = foobar;
    }

    public String getFoo() {
        return foo;
    }

    public String getBar() {
        return bar;
    }

    public String getFoobar() {
        return foobar;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final ImmutableObject foobar1 = (ImmutableObject) o;
        return Objects.equals(foo, foobar1.foo) &&
                Objects.equals(bar, foobar1.bar) &&
                Objects.equals(foobar, foobar1.foobar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foo, bar, foobar);
    }

    public static class Builder {
        private String foo = "foo";
        private String bar = "bar";
        private String foobar;

        public Builder withFoo(final String foo) {
            this.foo = foo;
            return this;
        }

        public Builder withBar(final String bar) {
            this.bar = bar;
            return this;
        }

        public Builder withFoobar(final String foobar) {
            this.foobar = foobar;
            return this;
        }

        public ImmutableObject build() {
            return new ImmutableObject(foo, bar, foobar);
        }
    }
}
