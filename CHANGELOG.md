# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]


## Release honister_v2.1.0 - 2023-05-23(09:28:18 +0000)

### New

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [Security][USP] Add ACLs for subscriptions to USP agent

## Release honister_v2.0.1 - 2023-05-22(15:09:16 +0000)

### Fixes

- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP] Input arguments must be JSON encoded

## Release honister_v2.0.0 - 2023-05-22(09:41:03 +0000)

### Breaking

- [mod-amxb-usp](https://gitlab.com/soft.at.home/usp/modules/amxb_backends/amxb_usp): Subscriptions with the USP backend no longer work

### New

- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): gsdm missing arguments for commands and events
- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP] Add NotifType AmxNotification for ambiorix events
- [libuspi](https://gitlab.com/soft.at.home/usp/libraries/libuspi): [USP] Add support for subscriptions to usp-endpoint
- [libuspi](https://gitlab.com/soft.at.home/usp/libraries/libuspi): [USP] Add NotifType AmxNotification for ambiorix events
- [libuspprotobuf](https://gitlab.com/soft.at.home/usp/libraries/libprotobuf): [USP] Add NotifType AmxNotification for ambiorix events
- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [USP] Add support for subscriptions to usp-endpoint
- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [USP] usp-endpoint must be able to broker amx subscriptions
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP][CDROUTER] The NotifExpiration limit is not respected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] uspagent must be able to broker amx subscriptions
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Send ForceReconnect based on AutoReconnect parameter
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] It must be possible to use protected methods

### Fixes

- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP] Remove var dumps from libusp
- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP][AMX] GSDM needs a ValueChangeType
- [mod-amxb-usp](https://gitlab.com/soft.at.home/usp/modules/amxb_backends/amxb_usp): [USP] Get with depth not working as expected
- [mod-amxb-usp](https://gitlab.com/soft.at.home/usp/modules/amxb_backends/amxb_usp): [USP] Agent stuck doing blocking amxb_resolves
- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [USP] Controllers with are added with an invalid EndpointID
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): HGWKPN-2285 [USP][Set Message] Error code not as expected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Correctly save last value of parameter subscriptions
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Must be able to forward notifications on IMTP
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Missing index number in ObjectCreation notifications
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Parameter paths must be fetched with depth=0
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Dynamically adding LocalAgent.MTP. instances does not work
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [KPN][USP] Boot! event notification is not as expected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Discovery object should not be protected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Disabling second controller breaks IMTP connection for first
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Improve ACL handling with adds
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP][Regression] Cannot find IMTP con for enabled controller
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Agent stuck doing blocking amxb_resolves

### Changes

- [libuspi](https://gitlab.com/soft.at.home/usp/libraries/libuspi): [USP] Port subscription changes to libuspi
- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [USP] Port subscription changes to usp-endpoint
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Add requests with search paths will be allowed

### Other

- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [uspe] Remove default endpoint id for uspe
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Add tr181-mqtt/tr181-localagent/uspagent into processmonitor
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Update unit tests after recent changes
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Documentation should be written for adding subscriptions to containers
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Extend subscription unit tests

## Release honister_v1.5.0 - 2023-04-26(08:44:54 +0000)

### New

- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP] Add NotifType AmxNotification for ambiorix events
- [libuspi](https://gitlab.com/soft.at.home/usp/libraries/libuspi): [USP] Add support for subscriptions to usp-endpoint
- [libuspprotobuf](https://gitlab.com/soft.at.home/usp/libraries/libprotobuf): [USP] Add NotifType AmxNotification for ambiorix events
- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [USP] Add support for subscriptions to usp-endpoint
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP][CDROUTER] The NotifExpiration limit is not respected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Send ForceReconnect based on AutoReconnect parameter

### Fixes

- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP] Remove var dumps from libusp
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Correctly save last value of parameter subscriptions
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Must be able to forward notifications on IMTP
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Parameter paths must be fetched with depth=0
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Dynamically adding LocalAgent.MTP. instances does not work
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [KPN][USP] Boot! event notification is not as expected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Discovery object should not be protected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Disabling second controller breaks IMTP connection for first
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Improve ACL handling with adds
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP][Regression] Cannot find IMTP con for enabled controller

### Changes

- [libuspi](https://gitlab.com/soft.at.home/usp/libraries/libuspi): [USP] Port subscription changes to libuspi
- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [USP] Port subscription changes to usp-endpoint
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Add requests with search paths will be allowed

### Other

- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [uspe] Remove default endpoint id for uspe
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Add tr181-mqtt/tr181-localagent/uspagent into processmonitor
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Update unit tests after recent changes
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Documentation should be written for adding subscriptions to containers
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Extend subscription unit tests

## Release honister_v1.5.0 - 2023-04-26(07:38:17 +0000)

### New

- [libuspi](https://gitlab.com/soft.at.home/usp/libraries/libuspi): [USP] Add support for subscriptions to usp-endpoint
- [libuspprotobuf](https://gitlab.com/soft.at.home/usp/libraries/libprotobuf): [USP] Add NotifType AmxNotification for ambiorix events
- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [USP] Add support for subscriptions to usp-endpoint
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP][CDROUTER] The NotifExpiration limit is not respected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Send ForceReconnect based on AutoReconnect parameter

### Fixes

- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP] Remove var dumps from libusp
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Correctly save last value of parameter subscriptions
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Must be able to forward notifications on IMTP
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Parameter paths must be fetched with depth=0
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Dynamically adding LocalAgent.MTP. instances does not work
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [KPN][USP] Boot! event notification is not as expected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Discovery object should not be protected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Disabling second controller breaks IMTP connection for first
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Improve ACL handling with adds
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP][Regression] Cannot find IMTP con for enabled controller

### Changes

- [libuspi](https://gitlab.com/soft.at.home/usp/libraries/libuspi): [USP] Port subscription changes to libuspi
- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [USP] Port subscription changes to usp-endpoint
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Add requests with search paths will be allowed

### Other

- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [uspe] Remove default endpoint id for uspe
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Add tr181-mqtt/tr181-localagent/uspagent into processmonitor
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Update unit tests after recent changes
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Documentation should be written for adding subscriptions to containers
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Extend subscription unit tests

## Release honister_v1.5.0 - 2023-04-25(14:09:52 +0000)

### New

- [libuspi](https://gitlab.com/soft.at.home/usp/libraries/libuspi): [USP] Add support for subscriptions to usp-endpoint
- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [USP] Add support for subscriptions to usp-endpoint
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP][CDROUTER] The NotifExpiration limit is not respected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Send ForceReconnect based on AutoReconnect parameter

### Fixes

- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP] Remove var dumps from libusp
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Correctly save last value of parameter subscriptions
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Must be able to forward notifications on IMTP
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Parameter paths must be fetched with depth=0
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Dynamically adding LocalAgent.MTP. instances does not work
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [KPN][USP] Boot! event notification is not as expected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Discovery object should not be protected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Disabling second controller breaks IMTP connection for first
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Improve ACL handling with adds
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP][Regression] Cannot find IMTP con for enabled controller

### Changes

- [libuspi](https://gitlab.com/soft.at.home/usp/libraries/libuspi): [USP] Port subscription changes to libuspi
- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [USP] Port subscription changes to usp-endpoint
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Add requests with search paths will be allowed

### Other

- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [uspe] Remove default endpoint id for uspe
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Add tr181-mqtt/tr181-localagent/uspagent into processmonitor
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Update unit tests after recent changes
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Documentation should be written for adding subscriptions to containers
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Extend subscription unit tests

## Release honister_v1.6.0 - 2023-04-13(09:51:41 +0000)

## Release honister_v1.5.0 - 2023-04-12(15:05:12 +0000)

### New

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP][CDROUTER] The NotifExpiration limit is not respected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Send ForceReconnect based on AutoReconnect parameter

### Fixes

- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP] Remove var dumps from libusp
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Correctly save last value of parameter subscriptions
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Must be able to forward notifications on IMTP
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Dynamically adding LocalAgent.MTP. instances does not work
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [KPN][USP] Boot! event notification is not as expected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Discovery object should not be protected
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Disabling second controller breaks IMTP connection for first

### Changes

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Add requests with search paths will be allowed

### Other

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Documentation should be written for adding subscriptions to containers

## Release honister_v1.4.3 - 2023-02-24(15:52:29 +0000)

### Fixes

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Parameter paths must be fetched with depth=0

### Other

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Add tr181-mqtt/tr181-localagent/uspagent into processmonitor
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Update unit tests after recent changes

## Release honister_v1.4.2 - 2023-02-09(12:41:03 +0000)

### Removed

- [mod-discovery](https://${GIT_BASE_URL}/amx/usp/modules/mod-discovery): Component removed
- [mod-usp-cli](https://${GIT_BASE_URL}/amx/usp/modules/amx_cli/mod-usp-cli): Component removed
- [mod-usp-onboarding](https://${GIT_BASE_URL}/amx/usp/modules/mod_usp_onboarding): Component removed

## Release honister_v1.4.0 - 2023-02-09(10:51:26 +0000)

## Release honister_v1.2.11 - 2023-02-01(14:38:09 +0000)

### Fixes

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): Remove doc target from uspagent

### Changes

- [mod-usp-onboarding](https://${GIT_BASE_URL}/amx/usp/modules/mod_usp_onboarding): [USP] Make mod_usp_onboarding configurable

## Release honister_v1.2.9 - 2023-01-31(13:04:33 +0000)

### Fixes

- [mod-usp-onboarding](https://${GIT_BASE_URL}/amx/usp/modules/mod_usp_onboarding): HGWKPN-1783 [ACS] [SW2]: Device.Reboot() runs but does not finish in MOTIVE

## Release honister_v1.2.8 - 2023-01-23(14:05:59 +0000)

### Fixes

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP Agent][Amx]USP request returns 'invalid path' all the time

## Release honister_v1.2.7 - 2023-01-13(08:07:17 +0000)

## Release honister_v1.2.6 - 2023-01-13(03:38:17 +0000)

## Release honister_v1.2.5 - 2023-01-13(03:21:18 +0000)

## Release honister_v1.2.4 - 2023-01-13(03:11:38 +0000)

## Release honister_v1.2.3 - 2023-01-13(03:04:17 +0000)

## Release honister_v1.2.2 - 2023-01-13(02:38:36 +0000)

## Release honister_v1.2.1 - 2023-01-12(17:22:52 +0000)

## Release honister_v1.2.0 - 2023-01-12(11:00:07 +0000)

### Other

- [libimtp](https://gitlab.com/soft.at.home/usp/libraries/libimtp): [SAHPairing] Make sahpairing work with MQTT client

## Release honister_v1.1.2 - 2023-01-11(16:34:41 +0000)

### Changes

- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): [KPN][USP] max_depth has no effect on the Get Message

## Release honister_v1.1.1 - 2023-01-11(16:29:33 +0000)

### Changes

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [KPN][USP] max_depth has no effect on the Get Message

## Release honister_v1.1.0 - 2023-01-11(16:04:48 +0000)

### New

- [mod-amxb-usp](https://gitlab.com/soft.at.home/usp/modules/amxb_backends/amxb_usp): [USP][AMX] Add support for asynchronous invokes to USP backend

### Fixes

- [mod-amxb-usp](https://gitlab.com/soft.at.home/usp/modules/amxb_backends/amxb_usp): [USP][AMX] Return variant of get_supported must be updated
- [mod-amxb-usp](https://gitlab.com/soft.at.home/usp/modules/amxb_backends/amxb_usp): Handle command output args for non-backend processes

### Changes

- [mod-amxb-usp](https://gitlab.com/soft.at.home/usp/modules/amxb_backends/amxb_usp): [KPN][USP] max_depth has no effect on the Get Message

## Release honister_v1.0.1 - 2023-01-11(14:28:14 +0000)

## Release honister_v1.0.0 - 2023-01-11(12:40:51 +0000)

### Breaking

- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [KPN][USP] max_depth has no effect on the Get Message

## Release honister_v0.0.11 - 2023-01-10(01:11:02 +0000)

## Release honister_v0.0.10 - 2023-01-09(15:45:49 +0000)

### Fixes

- [usp-endpoint](https://gitlab.com/soft.at.home/usp/applications/usp-endpoint): Handle command output args for non-backend processes

## Release honister_v0.0.9 - 2023-01-09(11:43:17 +0000)

### Fixes

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Get requests with valid search expressions must return successful

## Release honister_v0.0.8 - 2023-01-09(10:28:17 +0000)

### Fixes

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [Bulkdata][USP] Controller parameter must be set

## Release honister_v0.0.7 - 2023-01-09(09:24:18 +0000)

### Fixes

- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP] Get requests with valid search expressions must return successful
- [libusp](https://gitlab.com/soft.at.home/usp/libraries/libusp): [USP] GSDM response cannot be extracted properly

## Release honister_v0.0.6 - 2023-01-09(09:19:57 +0000)

### Fixes

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): LocalAgent.MTP.i.Status must be Up if MQTT client is connected

## Release honister_v0.0.5 - 2023-01-06(13:23:35 +0000)

### Fixes

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [uspagent] dm:OperationComplete created too late

## Release honister_v0.0.4 - 2022-12-20(13:59:19 +0000)

## Release honister_v0.0.3 - 2022-12-07(09:05:39 +0000)

### Fixes

- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [AMX] Apply new amxd_path_setf formatting
- [uspagent](https://gitlab.com/soft.at.home/usp/applications/uspagent): [USP] Allow invoking commands without braces

