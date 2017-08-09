package pl.jakubchmura.snmp.mib.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndex;
import com.intellij.psi.stubs.StubIndexKey;
import org.jetbrains.annotations.NotNull;
import pl.jakubchmura.snmp.mib.psi.impl.SmiMibNodeMixin;

import java.util.Collection;

public class MibNodeOidIndex extends StringStubIndexExtension<SmiMibNodeMixin> {

    public static final StubIndexKey<String, SmiMibNodeMixin> KEY = StubIndexKey.createIndexKey("mib.mibnode.oid");

    private static final MibNodeOidIndex ourInstance = new MibNodeOidIndex();

    public static MibNodeOidIndex getInstance() {
        return ourInstance;
    }

    @NotNull
    @Override
    public StubIndexKey<String, SmiMibNodeMixin> getKey() {
        return KEY;
    }

    @Override
    public Collection<SmiMibNodeMixin> get(@NotNull String s, @NotNull Project project, @NotNull GlobalSearchScope scope) {
        return StubIndex.getElements(getKey(), s, project, scope, SmiMibNodeMixin.class);
    }
}