// This is a generated file. Not intended for manual editing.
package pl.jakubchmura.snmp.mib.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SmiSnmpModuleIdentityMacroType extends SmiDefinedMacroType {

  @NotNull
  SmiSnmpContactPart getSnmpContactPart();

  @NotNull
  SmiSnmpDescrPart getSnmpDescrPart();

  @NotNull
  SmiSnmpOrganizationPart getSnmpOrganizationPart();

  @NotNull
  List<SmiSnmpRevisionPart> getSnmpRevisionPartList();

  @NotNull
  SmiSnmpUpdatePart getSnmpUpdatePart();

}
