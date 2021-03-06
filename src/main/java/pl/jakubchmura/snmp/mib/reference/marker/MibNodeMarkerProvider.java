package pl.jakubchmura.snmp.mib.reference.marker;

import com.intellij.codeHighlighting.Pass;
import com.intellij.codeInsight.daemon.LineMarkerInfo;
import com.intellij.codeInsight.daemon.LineMarkerProviderDescriptor;
import com.intellij.openapi.editor.markup.GutterIconRenderer;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pl.jakubchmura.snmp.mib.psi.SmiTypeName;
import pl.jakubchmura.snmp.mib.psi.impl.SmiMibNodeMixin;
import pl.jakubchmura.snmp.mib.util.oid.SnmpOid;

import javax.swing.*;
import java.util.Collection;
import java.util.List;

public class MibNodeMarkerProvider extends LineMarkerProviderDescriptor {

    @Nullable
    @Override
    public String getName() {
        return null;
    }

    @Nullable
    @Override
    public LineMarkerInfo getLineMarkerInfo(@NotNull PsiElement element) {
        return null;
    }

    @Override
    public void collectSlowLineMarkers(@NotNull List<PsiElement> elements, @NotNull Collection<LineMarkerInfo> result) {
        for (PsiElement element : elements) {
            if (element instanceof SmiMibNodeMixin) {
                SmiMibNodeMixin mibNode = (SmiMibNodeMixin) element;
                Icon icon = mibNode.getPresentation().getIcon(false);
                result.add(new LineMarkerInfo<>(mibNode, mibNode.getTextRange(), icon, Pass.LINE_MARKERS,
                        o -> getOid(mibNode), null, GutterIconRenderer.Alignment.CENTER));
            } else if (element instanceof SmiTypeName) {
                SmiTypeName typeName = (SmiTypeName) element;
                Icon icon = typeName.getPresentation().getIcon(false);
                result.add(new LineMarkerInfo<>(typeName, typeName.getTextRange(), icon, Pass.LINE_MARKERS,
                        null, null, GutterIconRenderer.Alignment.CENTER));
            }
        }
    }

    private String getOid(SmiMibNodeMixin mibNode) {
        SnmpOid oid = mibNode.getOid();
        if (oid != null) {
            return oid.toString();
        }
        return "";
    }


}
