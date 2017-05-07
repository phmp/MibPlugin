// This is a generated file. Not intended for manual editing.
package pl.jakubchmura.snmp.mib.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;

public interface SmiModuleIdentifier extends SmiIdentifiableElement {

  @Nullable
  SmiObjectIdentifierValue getObjectIdentifierValue();

  @NotNull
  PsiElement getIdentifierString();

  String getName();

  PsiElement setName(String name);

  PsiReference getReference();

}
