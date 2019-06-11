package net.autobuilder.issues.i17;

import com.google.auto.value.AutoValue;
import com.google.auto.value.extension.memoized.Memoized;

@AutoValue
abstract class Foo {

    abstract String barProperty();

    @Memoized
    String derivedProperty() {
        return "your " + barProperty() + " is ready";
    }
}
